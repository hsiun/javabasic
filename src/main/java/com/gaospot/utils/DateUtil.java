package com.gaospot.utils;


import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 时间处理的工具类
 * Created by gao on 2018/10/22.
 */
public class DateUtil {

    public static final String DEFAULT_FORMAT_STR = "yyyyMMddHHmmss";
    public static final String DATE_FORMAT_STR = "yyyy-MM-dd";




    public static String getCurrentDate() {
        return date2Str(new Date(), DATE_FORMAT_STR);
    }
    /**
     * 按照formatStr传入的格式格式化时间
     * @param formatStr
     * @return
     */
    public static String getCurrentDate(String formatStr) {
        if (formatStr == null) {
            formatStr = DATE_FORMAT_STR;
        }
        return date2Str(new Date(), formatStr);
    }

    /**
     * 将传入的Date转化为formatStr格式
     * @param date
     * @param formatStr
     * @return
     */
    public static String date2Str(Date date, String formatStr) {

        if (date == null || formatStr == null) {
            return "";
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(formatStr);
        return simpleDateFormat.format(date);
    }

    public static void main(String[] args) {
        String filename = DateUtil.getCurrentDate()+".xml";
        System.out.println("filename = " + filename);
    }

}
