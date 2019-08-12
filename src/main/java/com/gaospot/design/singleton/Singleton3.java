package com.gaospot.design.singleton;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-08-12 10:08
 */

public class Singleton3 {

    private volatile static Singleton3  singleton3;

    private Singleton3() {
    }

    /**
     * 直接对创建的方法加锁，实现简单，可以避免线程不安全的问题，但是性能差
     * @return
     */
    public synchronized Singleton3 createInstance() {
        if (singleton3 == null) {
            singleton3 = new Singleton3();
        }

        return singleton3;
    }

}
