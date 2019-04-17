package com.gaospot.concurrency;

/**
 * @author: gaoxiong@asiainfo.com
 * @date: 2019/4/14 5:47 PM
 * @description: 模版方法实现
 */

public abstract class TestTemplate {

    public final void templateMethod(String message) {
        System.out.println("+++++++++++++++++++");
        //花式打印message，可以在子类中实现自己的方法
        warpPrint("message");
        System.out.println("+++++++++++++++++++");
    }

    protected abstract void warpPrint(String message);


    public static void main(String[] args) {
        TestTemplate testTemplate = new TestTemplate() {
            @Override
            protected void warpPrint(String message) {
                System.out.println("+" + message + "+");
            }
        };

        testTemplate.templateMethod("Hello, World");
    }
}
