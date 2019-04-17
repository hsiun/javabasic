package com.gaospot.singleton;

/**
 * @author: gaoxiong@asiainfo.com
 * @date: 2019/3/4 10:25 PM
 * @description: //TODO
 */

public class Singleton2 {
    private static Singleton2 instance = null;

    private Singleton2() {}

    public static Singleton2 getInstance() {
        if (instance == null) {
            synchronized (Singleton2.class) {
                if (instance == null) {
                    instance = new Singleton2();
                }
            }
        }

        return instance;
    }
}
