package com.common.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 时间工具类
 * @author Administrator
 *
 */
public class DateUtil {
		
	public final static DateFormat YYYY_MM_DD_MM_HH_SS = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	public final static DateFormat YYYYMMDD_MM_HH_SS = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	
	public final static DateFormat YYYY_MM_DD = new SimpleDateFormat("yyyy-MM-dd");
	
	public final static DateFormat YYYYMMDDMMHHSSSSS = new SimpleDateFormat("yyyyMMddHHmmssSSS");
	
	public final static DateFormat YYYYMMDDHHMMSS = new SimpleDateFormat("yyyyMMddHHmmss");

	public static final DateFormat YYYYMMDD = new SimpleDateFormat("yyyyMMdd");
	/**
	 * 时间转换为yyyy-MM-dd HH:mm:ss格式的字符串
	 * @param date
	 * @return
	 */
	public static String dateToString(Date date){
		return YYYY_MM_DD_MM_HH_SS.format(date);
	}
	/**
	 * 时间转换为yyyy-MM-dd 格式的字符串
	 * @param date
	 * @return
	 */
	public static String dateToStrings(Date date){
		return YYYY_MM_DD.format(date);
	}
	
	public static String dateToString1(Date date){
		return YYYY_MM_DD.format(date);
	}
	
	public static String dateToString2(Date date){
		return YYYYMMDD_MM_HH_SS.format(date);
	}
	
	public static String simple(Date date) {
		return YYYYMMDD.format(date);
	}
	
	public static String simple2(Date date) {
		return YYYYMMDDHHMMSS.format(date);
	}
	
	public static Date strToDate(String dateString){
		Date date = null;
		try {
			date = YYYY_MM_DD_MM_HH_SS.parse(dateString);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}
	
	public static Date strToYYMMDDDate(String dateString){
		Date date = null;
		try {
			date = YYYY_MM_DD.parse(dateString);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}
	
	//获取系统时间并返回时间格式
	public static Date currentDate(){
		Date date = null;
		try {
			String currentDates = YYYY_MM_DD_MM_HH_SS.format(new Date());
			date = YYYY_MM_DD_MM_HH_SS.parse(currentDates);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}
	
	/**
	 * 得到当前时间距2013-11-01 00:00:00的小时数
	 * @return
	 * @throws java.text.ParseException
	 */
	public long getHours(){
		SimpleDateFormat simple = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = null;
		try {
			date = simple.parse("2013-11-01 00:00:00");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		long millisecond=System.currentTimeMillis()-date.getTime();
		long temp = 1000*60*60 ;
		return  millisecond/temp;
	}

	/**
     * 计算两个日期之间相差的天数
     * @param smdate 较小的时间
     * @param bdate  较大的时间
     * @return 相差天数
     * @throws java.text.ParseException
     */
    public static int daysBetween(Date smdate,Date bdate)
    {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        try {
			smdate=sdf.parse(sdf.format(smdate));
		} catch (ParseException e) {
			e.printStackTrace();
		}
        try {
			bdate=sdf.parse(sdf.format(bdate));
		} catch (ParseException e) {
			e.printStackTrace();
		}
        Calendar cal = Calendar.getInstance();
        cal.setTime(smdate);
        long time1 = cal.getTimeInMillis();
        cal.setTime(bdate);
        long time2 = cal.getTimeInMillis();
        long between_days=(time2-time1)/(1000*3600*24);

       return Integer.parseInt(String.valueOf(between_days));
    }

	/**
	 * 计算两个时间之间相差的天数
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	public static long diffDays(Date startDate,Date endDate){
		long days = 0;
		long start = startDate.getTime();
		long end = endDate.getTime();
		//一天的毫秒数1000 * 60 * 60 * 24=86400000
		days = (end - start) / 86400000;
		return days;
	}

	/**
	 * 日期加上月数的时间
	 * @param date
	 * @param month
	 * @return
	 */
	public static Date dateAddMonth(Date date,int month){
		return add(date,Calendar.MONTH,month);
	}

	/**
	 * 日期加上天数的时间
	 * @param date
	 * @param month
	 * @return
	 */
	public static Date dateAddDay(Date date,int day){
		return add(date,Calendar.DAY_OF_YEAR,day);
	}

	/**
	 * 日期加上年数的时间
	 * @param date
	 * @param year
	 * @return
	 */
	public static Date dateAddYear(Date date,int year){
		return add(date,Calendar.YEAR,year);
	}

	 /**
     * 计算剩余时间 (多少天多少时多少分)
     * @param startDateStr
     * @param endDateStr
     * @return
     */
    public static String remainDateToString(Date startDate, Date endDate){
    	StringBuilder result = new StringBuilder();
    	if(endDate == null ){
    		return "过期";
    	}
    	long times = endDate.getTime() - startDate.getTime();
    	if(times < -1){
    		result.append("过期");
    	}else{
    		long temp = 1000 * 60 * 60 *24;
    		//天数
    		long d = times / temp;

    		//小时数
    		times %= temp;
    		temp  /= 24;
    		long m = times /temp;
    		//分钟数
    		times %= temp;
    		temp  /= 60;
    		long s = times /temp;

    		result.append(d);
    		result.append("天");
    		result.append(m);
    		result.append("小时");
    		result.append(s);
    		result.append("分");
    	}
    	return result.toString();
    }

	private static Date add(Date date,int type,int value){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(type, value);
		return calendar.getTime();
	}


	/**
	 * @MethodName: getLinkUrl
	 * @Param: DateUtil
	 * flag ： true 转换  false 不转换
	 * @Author: gang.lv
	 * @Date: 2013-5-8 下午02:52:44
	 * @Return:
	 * @Descb:
	 * @Throws:
	*/
	public static String getLinkUrl(boolean flag,String content,String id){
		if(flag){
			content = "<a href='finance.do?id="+id+"'>"+content+"</a>";
		}
		return content;
	}

	/**
	 * 时间转换为时间戳
	 * @param format
	 * @param date
	 * @return
	 * @throws java.text.ParseException
	 */
	public static long getTimeCur(String format,String date) throws ParseException{
		SimpleDateFormat sf = new SimpleDateFormat(format);
		return  sf.parse(sf.format(date)).getTime();
	}
	/**
	 * 时间转换为时间戳
	 * @param format
	 * @param date
	 * @return
	 * @throws java.text.ParseException
	 */
	public static long getTimeCur(String format,Date date) throws ParseException{
		SimpleDateFormat sf = new SimpleDateFormat(format);
		return  sf.parse(sf.format(date)).getTime();
	}

	/**
	 * 将时间戳转为字符串
	 * @param cc_time
	 * @return
	 */
	public static String getStrTime(String cc_time) {
	 String re_StrTime = null;
	 SimpleDateFormat sdf = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
	 long lcc_time = Long.valueOf(cc_time);
	 re_StrTime = sdf.format(new Date(lcc_time * 1000L));
	 return re_StrTime;
	 }

	public static int getAge(Date birthday) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(birthday);
		Calendar nowDate = Calendar.getInstance();

		return nowDate.get(Calendar.YEAR) - calendar.get(Calendar.YEAR);
	}
	/**
	 * 当前时间减去分钟数得到的时间
	 * @param minutes
	 * @return
	 * @throws java.text.ParseException
	 */
	public static String getDateMinusMinutes(int minutes) throws ParseException{
		SimpleDateFormat formatter=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    	Date nowTime = new Date(); 
    	String datetest=formatter.format(nowTime);
    	Date date=formatter.parse(datetest);
    	long Time1=(date.getTime()/1000)-60*minutes;//减去30分
    	date.setTime(Time1*1000);
    	return formatter.format(date);
	}
	
	/**
	 * 和当前时间比较是否在给定的时长内
	 * @param validTime 给定的时间
	 * @param time 给定的时长（s）
	 * @return true 有效 false 无效
	 */
	public static boolean inValidTime(Date validTime, int time){
		long currTime = System.currentTimeMillis();
		long valid = validTime.getTime();
		
		return ((currTime - valid) < time*1000);
	}
	
	/**
	 * 获取年
	 * @param time
	 * @return
	 */
	public static int getYear(Date time) {
		if (time == null) {
			return -1;
		}
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(time);
		
		return calendar.get(Calendar.YEAR);
	}
	
	/**
	 * 获取月
	 * @param time
	 * @return
	 */
	public static int getMonth(Date time) {
		if (time == null) {
			return -1;
		}
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(time);
		
		return calendar.get(Calendar.MONTH) + 1;
	}
	
	/**
	 * 获取日
	 * @param time
	 * @return
	 */
	public static int getDay(Date time) {
		if (time == null) {
			return -1;
		}
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(time);
		
		return calendar.get(Calendar.DAY_OF_MONTH);
	}
	
	/**
	 * 获取年
	 * @return
	 */
	public static int getYear() {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		
		return calendar.get(Calendar.YEAR);
	}
	
	/**
	 * 获取月
	 * @return
	 */
	public static int getMonth() {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		
		return calendar.get(Calendar.MONTH) + 1;
	}
	
	/**
	 * 获取日
	 * @return
	 */
	public static int getDay() {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		
		return calendar.get(Calendar.DAY_OF_MONTH);
	}
	/**
	 *  判断两个日期是不是同一天
	 * @return
	 */
	public	static boolean isSameDate(Date date1, Date date2) {
        Calendar cal1 = Calendar.getInstance();
        cal1.setTime(date1);
        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(date2);
        boolean isSameYear = cal1.get(Calendar.YEAR) == cal2
                .get(Calendar.YEAR);
        boolean isSameMonth = isSameYear
                && cal1.get(Calendar.MONTH) == cal2.get(Calendar.MONTH);
        boolean isSameDate = isSameMonth
                && cal1.get(Calendar.DAY_OF_MONTH) == cal2
                        .get(Calendar.DAY_OF_MONTH);

        return isSameDate;
    }

    /**
     *  获取时间差 秒数
     * @param beginTime 开始时间
     * @return
     */
    public static long getSecondsToCurrent(long beginTime){
        long endTime=System.currentTimeMillis();
        long seconds=(endTime-beginTime)/1000;
        return seconds;
    }


}
