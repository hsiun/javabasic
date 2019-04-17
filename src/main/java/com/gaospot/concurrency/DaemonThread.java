package com.gaospot.concurrency;

/**
 * @author: gaoxiong@asiainfo.com
 * @date: 2019/4/17 8:28 AM
 * @description: 守护进程
 */

public class DaemonThread {

    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            Thread innerThread = new Thread(() -> {
                while (true) {
                    System.out.println("daemon is runing ");
                }
            });

            innerThread.setDaemon(true);
            innerThread.start();
        });
        thread.start();
    }
}
