package com.gaospot.design.decorator;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-08-09 10:45
 */

public class CDecorated extends Decorator {
    public CDecorated(BaseClass baseClass) {
        this.baseClass = baseClass;
    }

    @Override
    public double cost() {
        return 3.33 + baseClass.cost();
    }
}
