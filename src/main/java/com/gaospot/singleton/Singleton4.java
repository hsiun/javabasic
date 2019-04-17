package com.gaospot.singleton;

/**
 * @author: gaoxiong@asiainfo.com
 * @date: 2019/3/4 10:29 PM
 * @description: //TODO
 */

public class Singleton4 {

    private static class SingleInstance{
        private static final  Singleton4 instance = new Singleton4();
    }

    private Singleton4() {}

    public Singleton4 getInstance() {
        return SingleInstance.instance;
    }
}
