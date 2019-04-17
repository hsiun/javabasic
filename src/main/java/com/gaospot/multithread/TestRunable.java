package com.gaospot.multithread;

/**
 * @author: gaoxiong@asiainfo.com
 * @date: 2019/1/24 3:37 PM
 * @description: //TODO
 */

public class TestRunable {

    public static void main(String[] args) {
        MyRunable t1 = new MyRunable();
        new Thread(t1).start();
        new Thread(t1).start();
        new Thread(t1).start();

    }
}


class MyRunable implements Runnable{

    private int ticket = 10;

    @Override
    public void run() {
        long startTime = System.nanoTime();

        for (int i=0; i<10; i++) {
            synchronized (this) {
                if (ticket > 0) {
                    System.out.println("当前票号为： " + ticket);
                    ticket--;
                }
            }
        }
        long time = System.nanoTime() - startTime;
        System.out.println("time = " + time);

    }


}
