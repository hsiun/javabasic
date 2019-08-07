package com.gaospot.design.templatemethod;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-08-06 16:45
 */

public class Client {

    /**
     * 模版方法比较简单而且运用广泛
     * @param args
     */
    public static void main(String[] args) {
        CaffeineBeverage coffee = new Coffee();
        coffee.step();
        System.out.println("+++++++++++++++++++");
        coffee = new Tea();
        coffee.step();
    }
}
