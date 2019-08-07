package com.gaospot.design.templatemethod;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-08-06 16:41
 */

public class Coffee extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("coffee brew");
    }

    @Override
    void addCondiments() {
        System.out.println("coffee addCondiments");
    }
}
