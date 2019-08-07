package com.gaospot.design.factorymethod;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-08-05 16:24
 */

public class FactoryImpl1 extends Factory {
    @Override
    public Product factoryMethod() {
        return new ProductImpl1();
    }
}
