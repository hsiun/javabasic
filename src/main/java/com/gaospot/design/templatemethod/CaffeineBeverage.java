package com.gaospot.design.templatemethod;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-08-06 16:38
 */

public abstract class CaffeineBeverage {

    final void step() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    public void boilWater() {
        System.out.println("Water is boiled");
    }


    public void pourInCup() {
        System.out.println("Pour in cup");
    }

    abstract void brew();

    abstract void addCondiments();
}
