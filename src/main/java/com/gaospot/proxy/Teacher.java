package com.gaospot.proxy;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-07-11 14:49
 */

public class Teacher implements Man {
    @Override
    public void sayHello(String name) {
        System.out.println("Hello Teacher " + name);
    }

    @Override
    public void sayGoodby(String name) {
        System.out.println("Goodby Teacher " + name);
    }
}
