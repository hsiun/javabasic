package com.gaospot.design.strategy;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-08-06 16:19
 */

public class Squack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squack..");
    }
}
