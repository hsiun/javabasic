package com.gaospot.design.abstractfactory;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-08-05 16:37
 */

public class Factory2 extends AbstractFactory1 {


    @Override
    AbstractProductA createPrductA() {
        return new ProductA2();
    }

    @Override
    AbstractProductB createPrductB() {
        return new ProductB2();
    }
}
