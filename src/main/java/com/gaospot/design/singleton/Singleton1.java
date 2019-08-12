package com.gaospot.design.singleton;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-08-12 10:05
 */

public class Singleton1 {

    /**
     * 现在都用spring了，我感觉单利模式这种用的很少啊
     */
    private static Singleton1 singleton1;

    private Singleton1() {
    }

    public Singleton1 createInstance() {
        if (singleton1 == null) {
            singleton1 = new Singleton1();
        }
        return singleton1;
    }
}
