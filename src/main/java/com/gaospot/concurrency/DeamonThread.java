package com.gaospot.concurrency;

/**
 * @author: gaoxiong@asiainfo.com
 * @date: 2019/4/17 8:17 AM
 * @description: 创建守护进程
 */

public class DeamonThread {

    public static void main(String[] args) {

        Thread thread = new Thread(){
            @Override
            public void run() {
                try {
                    Thread.sleep(10_000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        thread.setDaemon(true);
        thread.start();
    }
}
