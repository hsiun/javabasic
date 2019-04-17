package com.gaospot.dynamicproxy;

/**
 * @Auther: gaoxiong@asiainfo.com
 * @Date: 2018/11/9 10:52 AM
 * @Description: ${des}
 */

public class RealSubject implements Subject {
    @Override
    public void rent() {
        System.out.println("I want rent my house.");
    }

    @Override
    public void hello(String str) {
        System.out.println("Hello, " + str);
    }
}
