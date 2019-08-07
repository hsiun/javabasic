package com.gaospot.design.implementation;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-08-06 17:24
 */

public class Client {

    /**
     * 使用一个中间类去持有另一个类的对象，是这个类可以实现另一个的行为
     * 这个就是适配器
     *
     * @param args
     */
    public static void main(String[] args) {
        Turkey turkey = new WildTurkey();

        Duck duck = new TurkeyAdapter(turkey);

        duck.quack();
    }
}
