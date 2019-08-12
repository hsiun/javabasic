package com.gaospot.design.decorator;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-08-09 10:42
 */

public class ADecorated extends Decorator {

    public ADecorated(BaseClass baseClass) {
        this.baseClass = baseClass;
    }

    @Override
    public double cost() {
        return 1.11 + baseClass.cost();
    }
}
