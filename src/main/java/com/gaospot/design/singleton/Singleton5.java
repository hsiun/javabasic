package com.gaospot.design.singleton;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-08-12 10:20
 */

public class Singleton5 {


    private Singleton5() {
    }


    private static class SingletonHolder {
        private static final Singleton5 INSTANCE = new Singleton5();
    }


    public static Singleton5 getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
