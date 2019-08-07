package com.gaospot.design.abstractfactory;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-08-05 16:37
 */

public class Factory1 extends AbstractFactory1 {


    @Override
    AbstractProductA createPrductA() {
        return new ProductA1();
    }

    @Override
    AbstractProductB createPrductB() {
        return new ProductB1();
    }
}
