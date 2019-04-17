package com.gaospot.classload;

/**
 * @author: gaoxiong@asiainfo.com
 * @date: 2019/4/11 10:05 PM
 * @description: 测试类的初始化
 */

public class classInit {

    public static void main(String[] args) {
        System.out.println(Child.cliString);
    }

}


class Parent{
    public static String  string = "hello, world!";

    static {
        System.out.println("Parent static block. ");
    }
}


class Child extends Parent{
    public static String cliString = "hello2";

    static {
        System.out.println("Child static block. ");
    }
}
