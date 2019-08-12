package com.gaospot.threadstate;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-08-12 14:25
 */

public class SleepThread extends Thread {

    private String name;

    private Object lock;

    public SleepThread(String name, Object lock) {
        super(name);
        this.lock = lock;
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("在run方法体内部，线程"+ name + ":" +getState());
        synchronized (lock) {
            System.out.println("线程" + name + "获得了锁，的状态为" + getState());
            try {
                Thread.sleep(3_000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("线程"+ name +"等待时间结束" + getState());
        }


    }
}
