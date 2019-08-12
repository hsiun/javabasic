package com.gaospot.threadstate;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-08-12 14:57
 */

public class WaitThread extends Thread {

    private int timeout = 0;

    private Object lock;


    public WaitThread(String name, int timeout, Object lock) {
        super(name);
        this.timeout = timeout;
        this.lock = lock;
    }

    public WaitThread(String name, Object lock) {
        this(name,0, lock);
    }

    @Override
    public void run() {
        synchronized (lock) {
            if (timeout == 0) {
                try {
                    System.out.println("尝试调用wait方法");
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                try {
                    System.out.println("尝试调用wait方法，并等待" + timeout);
                    lock.wait(timeout);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("wait线程执行完毕");
    }
}
