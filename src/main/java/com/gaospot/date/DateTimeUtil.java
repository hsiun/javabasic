package com.gaospot.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author: gaoxiong@asiainfo.com
 * @date: 2019/2/20 5:21 PM
 * @description: 时间处理相关函数
 */

public class DateTimeUtil {


    public static String desDateMinut(String day, int hour, int min) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = null;
        try {
            date = format.parse(day);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        if (date == null)
            return "";
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        // 24小时制
        cal.add(Calendar.HOUR, -hour);
        cal.add(Calendar.MINUTE, -min);
        date = cal.getTime();
        return format.format(date);
    }


    public static void main(String[] args) {
        String time = desDateMinut("2019-02-19 12:00:00", 24, 30);
        System.out.println("time = " + time);
    }
}
