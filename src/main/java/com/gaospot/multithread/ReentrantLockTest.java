package com.gaospot.multithread;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: gaoxiong@asiainfo.com
 * @date: 2019/1/10 3:57 PM
 * @description: ReentrantLock可重入验证
 */

public class ReentrantLockTest implements Runnable {
    private ReentrantLock reentrantLock = new ReentrantLock();


    public static final int MAX = 10;

    //公平锁
    //private ReentrantLock reentrantLock = new ReentrantLock(true);

    public void get() {
        System.out.println("2 run thread name-->" + Thread.currentThread().getName());
        reentrantLock.lock();
        System.out.println("3 run thread name-->" + Thread.currentThread().getName());
        set();
        reentrantLock.unlock();
        System.out.println("5 run thread name-->" + Thread.currentThread().getName());
    }

    public void set() {
        reentrantLock.lock();
        System.out.println("4 run thread name-->" + Thread.currentThread().getName());
        reentrantLock.unlock();
    }

    @Override
    public void run() {
        System.out.println("1 run thread name-->" + Thread.currentThread().getName());
        get();
    }

    public static void main(String[] args) {
        ReentrantLockTest test = new ReentrantLockTest();

        for (int i = 0; i < MAX; i++) {
            new Thread(test, "thread-" + i).start();
        }
    }
}
