package com.gaospot.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-07-11 14:49
 */

public class ProxyClass implements InvocationHandler {

    private Object proxyObject;

    public ProxyClass(Object proxyObject) {
        this.proxyObject = proxyObject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("被代理之前");

        method.invoke(proxyObject, args);

        System.out.println("被代理之后");

        return null;
    }
}
