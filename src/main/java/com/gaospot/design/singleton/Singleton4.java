package com.gaospot.design.singleton;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-08-12 10:15
 */

public class Singleton4 {

    private volatile static Singleton4 singleton4;

    private Singleton4() {
    }

    /**
     * 通过双重校验避免性能问题
     *
     * @return
     */
    public Singleton4 createInstance() {
        if (singleton4 == null) {
            synchronized (Singleton4.class) {
                if (singleton4 == null) {
                    singleton4 = new Singleton4();
                }
            }
        }

        return singleton4;
    }

}
