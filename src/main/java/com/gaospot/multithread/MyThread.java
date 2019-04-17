package com.gaospot.multithread;

/**
 * @author: gaoxiong@asiainfo.com
 * @date: 2019/1/24 3:23 PM
 * @description: //TODO
 */

public class MyThread {
    public static void main(String[] args) {
        MyThread1 thread1 = new MyThread1("A");
        MyThread1 thread2 = new MyThread1("B");
        thread1.start();
        thread2.start();
    }

}

class MyThread1 extends Thread{
    private String name;

    public MyThread1(String name) {
        this.name = name;
    }


    @Override
    public void run() {
        for (int i=0; i < 5; i++) {
            System.out.println(name + i);
//            try {
//                sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }
}
