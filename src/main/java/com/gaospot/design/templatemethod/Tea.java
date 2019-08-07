package com.gaospot.design.templatemethod;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-08-06 16:41
 */

public class Tea extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("tea brew");
    }

    @Override
    void addCondiments() {
        System.out.println("tea addcondiments");
    }
}
