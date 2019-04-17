package com.gaospot.concurrency;


/**
 * @author: gaoxiong@asiainfo.com
 * @date: 2019/4/14 6:19 PM
 * @description: runable实现的叫号窗口
 */

public class TrickWindwoRunable implements Runnable{
    private static final int MAX = 50;
    private int index = 0;

    @Override
    public void run() {
        while (index <= MAX) {
            System.out.println(Thread.currentThread() +"" + index++ );
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
