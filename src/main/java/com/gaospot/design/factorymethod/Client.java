package com.gaospot.design.factorymethod;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-08-05 16:26
 */

public class Client {

    public static void main(String[] args) {
        /**
         * 这个就有点意思了，通过new不同的对象可以实现不同的行为
         */

        Factory factory = new FactoryImpl1();
        factory.doSomething();
    }
}
