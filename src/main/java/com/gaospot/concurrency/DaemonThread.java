package com.gaospot.concurrency;

import java.util.Optional;

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
                    System.out.println("daemon is running ");
                }
            });

            innerThread.setDaemon(true);
            innerThread.start();
        });
        System.out.println("outter daemon is running");
        thread.start();
        Optional.of(thread.getName()).ifPresent(System.out::print);
    }
}
