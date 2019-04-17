package com.gaospot.multithread;

/**
 * @author: gaoxiong@asiainfo.com
 * @date: 2019/1/10 3:57 PM
 * @description: synchronized可重入验证
 */

public class SynchronizedLockTest implements Runnable{
    public synchronized void get() {
        System.out.println("2 run thread name-->" + Thread.currentThread().getName());
        System.out.println("3 run thread name-->" + Thread.currentThread().getName());
        set();
        System.out.println("5 run thread name-->" + Thread.currentThread().getName());
    }

    public synchronized void set() {
        System.out.println("4 run thread name-->" + Thread.currentThread().getName());
    }

    @Override
    public void run() {
        System.out.println("1 run thread name-->" + Thread.currentThread().getName());
        get();
    }

    public static void main(String[] args) {
        SynchronizedLockTest test = new SynchronizedLockTest();

        for (int i = 0; i < 10; i++) {
            new Thread(test, "thread-" +i).start();
        }
    }
}
