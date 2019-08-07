package com.gaospot.design.prototype;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-08-05 17:11
 */

public class Client {

    public static void main(String[] args) {
        Prototype prototype = new PrototypeImpl("abc");
        Prototype prototype1 = prototype.myClone();
        System.out.println(prototype1.toString());
        if (prototype == prototype1) {
            System.out.println("true");
        }
    }
}
