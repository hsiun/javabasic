package com.gaospot.threadstate;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-08-12 14:11
 */

public class ThreadStateTest {

    public static void main(String[] args) {
        IOThread ioThread = new IOThread("IOThread");
        ioThread.start();

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("主线程获取IO线程的状态为" + ioThread.getState());
    }


}
