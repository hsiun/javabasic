package com.gaospot.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Auther: gaoxiong@asiainfo.com
 * @Date: 2018/11/9 10:53 AM
 * @Description: ${des}
 */

public class DynamicPorxy implements InvocationHandler {
    private Object subject;


    //动态代理的实现类，相当于通过这个类实现代理的
    public DynamicPorxy(Object subject) {
        this.subject = subject;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before rent house");

        System.out.println("Method:" + method);

        method.invoke(subject, args);

        System.out.println("after rent house");

        return null;
    }
}
