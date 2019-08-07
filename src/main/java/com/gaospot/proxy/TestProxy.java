package com.gaospot.proxy;

import java.io.FileOutputStream;
import java.lang.reflect.Proxy;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-07-11 14:51
 */

public class TestProxy {

    /**
     * 动态代理可以解决一个问题
     * 就是动态的增加现有类的功能，这个类可以是任意的
     * @param args
     */
    public static void main(String[] args) {
        Student student = new Student();

        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles","true");


        //通过实际的对象创建代理对象
        ProxyClass studentProxy = new ProxyClass(student);

        Class<?>[] interfaces = student.getClass().getInterfaces();
        ClassLoader classLoader = studentProxy.getClass().getClassLoader();

        Man o = (Man) Proxy.newProxyInstance(classLoader, interfaces, studentProxy);

        o.sayHello("高雄");
        o.sayGoodby("gao");


    }
}
