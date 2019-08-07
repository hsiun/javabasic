package com.gaospot.reflect;


import java.lang.reflect.Method;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-07-09 17:15
 */

public class ReflectMethod {

    public static void main(String[] args) {
        try {
            Class aClass1 = Class.forName("com.gaospot.reflect.Excel");
            Method print = aClass1.getMethod("print");
            //一定要实例化才能调用方法
            Object o = aClass1.newInstance();
            print.invoke(o);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
