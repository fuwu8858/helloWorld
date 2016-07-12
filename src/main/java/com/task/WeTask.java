package com.task;

import org.jasypt.util.text.BasicTextEncryptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * Created by gjy on 2016/1/6.
 */

public class WeTask {
    private static Logger logger = LoggerFactory.getLogger(WeTask.class);
    @Scheduled(cron="0/10 * * * * ? ") //间隔5秒执行
    public void taskCycle() throws UnsupportedEncodingException {
        logger.info("↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
        BasicTextEncryptor textEncryptor = new BasicTextEncryptor();

        textEncryptor.setPassword("o+p@c2w%bj");
        String newPassword = textEncryptor.encrypt("test");
        logger.info("加密后:【{}】", newPassword);
        logger.info("编码前:【{}】", newPassword);
        newPassword=URLEncoder.encode(newPassword,"UTF-8");
        logger.info("编码后:【{}】", newPassword);
        newPassword= URLDecoder.decode(newPassword,"UTF-8");
        logger.info("解码后:【{}】", newPassword);
        String oldPassword = textEncryptor.decrypt(newPassword);
        logger.info("加密前:【{}】",oldPassword);
        logger.info("↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑");
    }

}
