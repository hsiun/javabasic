package com.gaospot.threadstate;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-08-12 14:33
 */

public class SleepThreadTest {

    public static void main(String[] args) {
        Object lock = new Object();
        Thread thread1 = new SleepThread("thread1", lock);
        Thread thread2 = new SleepThread("thread2", lock);

        thread1.start();
        thread2.start();

//        try {
//            Thread.sleep(4_000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        System.out.println("在主方法中线程" + thread1.getName() +"的状态为" + thread1.getState());
        System.out.println("在主方法中线程" + thread2.getName() +"的状态为" + thread2.getState());
    }
}
