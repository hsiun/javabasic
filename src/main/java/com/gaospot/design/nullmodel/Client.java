package com.gaospot.design.nullmodel;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-08-06 16:53
 */

public class Client {

    public static void main(String[] args) {
        AbstractOperation operation = fun(-1);
        operation.request();
        System.out.println("++++++");
        operation = fun(1);
        operation.request();
    }

    static AbstractOperation fun(int n) {
        if (n < 0) {
            return new NullOperation();
        }

        return new RealOperation();
    }
}
