package com.gaospot.design.strategy;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-08-06 16:21
 */

public class Client {

    public static void main(String[] args) {
        Duck duck = new Duck();

        duck.setQuackBehavior(new Quack());
        duck.doPerform();

        duck.setQuackBehavior(new Squack());
        duck.doPerform();
    }
}
