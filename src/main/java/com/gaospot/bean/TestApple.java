package com.gaospot.bean;


import java.sql.Date;

/**
 * @author: gaoxiong@asiainfo.com
 * @date: 2019/3/19 2:45 PM
 * @description: 如果使用bean中的一个字段去修改另外一个字段的话，结果取决于这两个字段的赋值顺序。
 */

public class TestApple {
    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.setColor("blue");
        apple.setName("a");


        Date date = new Date(0);
        System.out.println("date.toString() = " + date.toString());

        System.out.println("apple = " + apple);

    }
}
