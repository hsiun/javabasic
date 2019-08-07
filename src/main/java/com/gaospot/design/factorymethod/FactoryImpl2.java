package com.gaospot.design.factorymethod;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-08-05 16:25
 */

public class FactoryImpl2 extends Factory{
    @Override
    public Product factoryMethod() {
        return new ProductImpl2();
    }
}
