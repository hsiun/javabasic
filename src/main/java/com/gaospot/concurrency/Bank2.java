package com.gaospot.concurrency;

/**
 * @author: gaoxiong@asiainfo.com
 * @date: 2019/4/14 6:23 PM
 * @description: 通过runable实现的银行系统
 */

public class Bank2 {

    public static void main(String[] args) {
        TrickWindwoRunable windows1 = new TrickWindwoRunable();

        new Thread(windows1, "窗口1").start();
        new Thread(windows1, "窗口2").start();
        new Thread(windows1, "窗口3").start();

    }
}
