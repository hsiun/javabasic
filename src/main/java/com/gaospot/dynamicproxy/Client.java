package com.gaospot.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @Auther: gaoxiong@asiainfo.com
 * @Date: 2018/11/9 10:56 AM
 * @Description: ${des}
 */

public class Client {

    public static void main(String[] args) {
        Subject realSubject = new RealSubject();

        InvocationHandler handler = new DynamicPorxy(realSubject);


        Subject subject = (Subject) Proxy.newProxyInstance(handler.getClass().getClassLoader(), realSubject
            .getClass().getInterfaces(), handler);

        System.out.println(subject.getClass().getName());

        subject.rent();
        subject.hello("world");
    }
}
