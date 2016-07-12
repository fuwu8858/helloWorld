package com.common.util;


import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Random;

/**  用户密码加密方式
 * Created by gjy on 2016/1/7.
 */
public class Encrypt {
    private static Logger log = LoggerFactory.getLogger(Encrypt.class);
    public Encrypt() {
    }

    public static String MD5(String input) {
        return MD5(input, (Charset)Charset.defaultCharset());
    }

    public static String MD5(String input, String charset) {
        return MD5(input, (Charset)Charset.forName(charset));
    }

    public static String MD5(String input, Charset charset) {
        MessageDigest md = null;

        try {
            md = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException var9) {
            var9.printStackTrace();
        }

        md.update(input.getBytes(charset));
        char[] hexDigits = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        byte[] tmp = md.digest();
        char[] str = new char[32];
        int k = 0;

        for(int result = 0; result < 16; ++result) {
            byte byte0 = tmp[result];
            str[k++] = hexDigits[byte0 >>> 4 & 15];
            str[k++] = hexDigits[byte0 & 15];
        }

        String var10 = new String(str);
        return var10;
    }


    /**
     * 生成签名  时间戳   随机字符串   token
     * @param timeStamp
     * @param nonce
     * @param token
     * @return
     */
    public static String getSignature(String timeStamp,String nonce,String token){
        log.info("根据timeStamp【{}】,nonce【{}】,token【{}】↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑",timeStamp,nonce,token );
        String[] tokenSort={timeStamp,nonce,token };
        /*进行排序*/
        Arrays.sort(tokenSort);
        StringBuffer concatString=new StringBuffer();
        for (String sorNumber:tokenSort){
            concatString.append(sorNumber);
        }
       /*进行 sha1 加密*/
        String temSignature= DigestUtils.shaHex(concatString.toString());
        log.info("生成的temSignature>>>>>>>>>>>>>>>【{}】",temSignature );
        log.info("根据timeStamp【{}】,nonce【{}】,token【{}】↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑",timeStamp,nonce,token );
        return temSignature;
    }

    /**
     * 校验签名
     * @param signature
     * @param timestamp
     * @param nonce
     * @param token
     * @return 签名 正确 true  错误 false
     */
    public static boolean checkSignature(String signature,String timestamp,String nonce,String token,Integer timeStampOut){
        log.info("校验签名****************start************************");
        if(StringUtils.isBlank(signature)||StringUtils.isBlank(timestamp)||StringUtils.isBlank(nonce)){
            log.info("校验参数有误》》》》》》》》》signature【{}】,timestamp【{}】，nonce【{}】",signature,timestamp,nonce);
            log.info("校验签名****************end************************");
            return false;
        }
       Long seconds=DateUtil.getSecondsToCurrent(Long.parseLong(timestamp));
        if(seconds>timeStampOut){
            log.info("签名已过期》》》》》》》》》有效时间【{}】s,此签名为【{}】s",timeStampOut,seconds);
            log.info("校验签名****************end************************");
            return false;
        }
        log.info("签名有效》》》》》》》》》有效时间【{}】s,此签名为【{}】s",timeStampOut,seconds);
        log.info(String.format("老加密: %s", signature));
        String[] tokenSort={timestamp,nonce, token};
        /*进行排序*/
        Arrays.sort(tokenSort);
        StringBuffer concatString=new StringBuffer();
        for (String sorNumber:tokenSort){
            concatString.append(sorNumber);
        }
       /*进行 sha1 加密*/
        String temSignature= DigestUtils.shaHex(concatString.toString());
        log.info(String.format("新加密: %s", temSignature));
        log.info("校验签名****************end************************");
        if(temSignature.equals(signature)){
            return true;
        }

        return false;

    }
    /**
     * 获取指定长度的随即数字字符串
     *
     * @param length
     * @return
     */
    public static String getRandomNumber(int length) {
        StringBuffer buffer = new StringBuffer("0123456789abcdefghijklmnopqrstuvwxyz");
        StringBuffer sb = new StringBuffer();
        Random r = new Random();
        int range = buffer.length();
        for (int i = 0; i < length; i ++) {
            sb.append(buffer.charAt(r.nextInt(range)));
        }
        return sb.toString();
    }










}
