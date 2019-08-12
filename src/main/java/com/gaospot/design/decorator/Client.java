package com.gaospot.design.decorator;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-08-09 10:47
 */

public class Client {

    public static void main(String[] args) {
        BaseClass baseClass = new BClass();

        baseClass = new ADecorated(baseClass);
        baseClass = new BDecorated(baseClass);
        baseClass = new CDecorated(baseClass);

        System.out.println(baseClass.cost());
    }
}
