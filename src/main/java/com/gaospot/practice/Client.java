package com.gaospot.practice;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-08-06 09:34
 */

public class Client {

    public static void main(String[] args) {

        Person student = new Student();

        student.setAge(11);
        student.setName("test");

        System.out.println("student = " + student.toString());
    }
}
