package com.gaospot.singleton;

/**
 * @author: gaoxiong@asiainfo.com
 * @date: 2019/3/4 10:19 PM
 * @description: 通过static创建单利
 */

public class Singleton {

    /**
     * 初始化为static类型，随着类加载同时创建对象
     */
    private static Singleton instance = new Singleton();

    /**
     *  防止外部创建
     */
    private Singleton() {}

    public static Singleton getInstance() {
        return instance;
    }
}
