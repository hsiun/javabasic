package com.gaospot.design.factorymethod;


/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-08-05 16:10
 */

public class ProductImpl1 implements Product {

    @Override
    public void sayHello() {
        System.out.println("Hello, ProductImpl1");
    }
}
