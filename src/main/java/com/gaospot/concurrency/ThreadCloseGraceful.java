package com.gaospot.concurrency;

/**
 * @author: gaoxiong@asiainfo.com
 * @date: 2019/4/18 8:11 AM
 * @description: //TODO
 */

public class ThreadCloseGraceful {

    public static void main(String[] args) {

        Thread t1 = new Thread() {
            private volatile boolean flag = true;

            @Override
            public void run() {
                while (!this.isInterrupted()) {
                    //do something
                    System.out.println("do something... ");
                }
            }

            public void shutdown(boolean flag) {
                this.flag = flag;
            }
        };

        t1.start();
        //t1.shutdown();
        t1.interrupt();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("t1 is interrupted ..");



    }
}
