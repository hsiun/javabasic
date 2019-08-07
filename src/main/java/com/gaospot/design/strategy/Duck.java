package com.gaospot.design.strategy;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-08-06 16:20
 */

public class Duck {
    QuackBehavior quackBehavior;


    public void doPerform() {
        if (quackBehavior != null) {
            quackBehavior.quack();
        }
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
