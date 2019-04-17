package com.gaospot.singleton;

/**
 * @author: gaoxiong@asiainfo.com
 * @date: 2019/3/4 10:21 PM
 * @description: 单利模式2
 */

public class Singleton1 {
    private static Singleton1 instance = null;

    private Singleton1() {}


    public static synchronized Singleton1 getInstance() {
        if (instance == null) {
            instance = new Singleton1();
        }

        return instance;
    }
}
