package com.gaospot.proxy;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-07-11 14:47
 */

public class Student implements Man {

    @Override
    public void sayHello(String name) {
        System.out.println("Hello Student " + name);
    }

    @Override
    public void sayGoodby(String name) {
        System.out.println("Goodby Student " + name);

    }
}
