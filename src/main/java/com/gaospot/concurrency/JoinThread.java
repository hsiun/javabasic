package com.gaospot.concurrency;

/**
 * @author: gaoxiong@asiainfo.com
 * @date: 2019/4/17 9:48 PM
 * @description: join API测试
 */

public class JoinThread {
    public static void main(String[] args) {
        Thread thread = new Thread(
                () -> {
                    try {
                        Thread.sleep(100_000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName());
                }
        );
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName());
    }




}
