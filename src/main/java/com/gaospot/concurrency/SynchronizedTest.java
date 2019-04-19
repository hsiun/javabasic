package com.gaospot.concurrency;

/**
 * @author: gaoxiong@asiainfo.com
 * @date: 2019/4/19 8:00 AM
 * @description: //TODO
 */

public class SynchronizedTest {

    private final static Object LOCK = new Object();


    public static void main(String[] args) {

        Runnable runnable = () ->{
            synchronized (LOCK) {

            try {
                Thread.sleep(100_0000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }};

        Thread thread = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);

        thread.start();
        thread2.start();
        thread3.start();

    }
}
