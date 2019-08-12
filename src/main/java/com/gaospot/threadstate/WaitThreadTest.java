package com.gaospot.threadstate;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-08-12 15:06
 */

public class WaitThreadTest {

    public static void main(String[] args) {
        Object lock = new Object();
        WaitThread thread = new WaitThread("waitThread", 1000, lock);
        thread.start();

        JoinThread joinThread = new JoinThread(thread, "joinThread");
        joinThread.start();

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("主线程获取wait线程状态为" + thread.getState());
    }
}
