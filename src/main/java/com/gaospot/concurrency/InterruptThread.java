package com.gaospot.concurrency;

/**
 * @author: gaoxiong@asiainfo.com
 * @date: 2019/4/18 7:57 AM
 * @description: 这里相当于t2给t1发送了一个中断信息
 */

public class InterruptThread {

    public static void main(String[] args) {

        Thread t1 = new Thread() {
            @Override
            public void run() {
                while (true) {

                }
            }
        };

        t1.start();
        Thread main = Thread.currentThread();

        Thread t2 = new Thread() {
            @Override
            public void run() {
                main.interrupt();
                System.out.println("t1 interrupted ");
            }
        };

        t2.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
