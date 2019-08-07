package com.gaospot.design.factorymethod;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-08-05 16:22
 */

public abstract class Factory {

    public abstract Product factoryMethod();

    public void doSomething() {
        Product product = factoryMethod();
        product.sayHello();
    }
}
