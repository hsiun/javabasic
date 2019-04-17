package com.gaospot.concurrency;

/**
 * @author: gaoxiong@asiainfo.com
 * @date: 2019/4/14 6:02 PM
 * @description: 用于模拟叫号的类
 */

public class TrickWindows extends Thread{

    private static final int MAX = 50;

    private String name;

    private static int index = 1;


    TrickWindows(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        while (index <= MAX) {
            System.out.println("柜台：" + name + "，现在叫的号是" + index++);
        }
    }
}
