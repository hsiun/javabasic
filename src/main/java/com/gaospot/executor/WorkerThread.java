package com.gaospot.executor;
import java.util.Date;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-08-15 15:05
 */


/**
 * 这是一个简单的Runnable类，需要大约5秒钟来执行其任务。
 */
public class WorkerThread implements Runnable {

    private String command;

    public WorkerThread(String s) {
        this.command = s;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Start. Time = " + new Date());
        processCommand();
        System.out.println(Thread.currentThread().getName() + " End. Time = " + new Date());
    }

    private void processCommand() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return this.command;
    }
}
