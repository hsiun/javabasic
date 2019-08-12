package com.gaospot.design.decorator;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-08-09 10:45
 */

public class BDecorated extends Decorator {
    public BDecorated(BaseClass baseClass) {
        this.baseClass = baseClass;
    }

    @Override
    public double cost() {
        return 2.22 + baseClass.cost();
    }
}
