package com.gaospot.concurrency;

/**
 * @author: gaoxiong@asiainfo.com
 * @date: 2019/4/14 11:53 AM
 * @description: 通过new thread方法创建新线程
 */

public class NewThread {

    public static void main(String[] args) {
        Thread thread = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("i = " + i);
                    try {
                        Thread.sleep(1000 * 10L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        thread.start();

        for (int j=0; j<1000; j++) {
            System.out.println("j = " + j);
        }
    }
}
