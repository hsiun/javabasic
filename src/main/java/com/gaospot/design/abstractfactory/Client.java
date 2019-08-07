package com.gaospot.design.abstractfactory;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-08-05 16:45
 */

public class Client {

    public static void main(String[] args) {
        /**
         * 这个相较于前一个的区别在于可以创建两种产品？
         */

        AbstractFactory1 factory = new Factory1();
        AbstractProductA prductA = factory.createPrductA();
        AbstractProductB prductB = factory.createPrductB();

        prductA.sayHello();
        prductB.sayHello();
    }
}
