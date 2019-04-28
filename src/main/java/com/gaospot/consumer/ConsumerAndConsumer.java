package com.gaospot.consumer;

/**
 * @author: gaoxiong@asiainfo.com
 * @date: 2019/4/27 10:32 AM
 * @description: 通过notify和wait实现线程间通信
 */

public class ConsumerAndConsumer {

    private int i = 0;

    final private Object LOCK = new Object();

    volatile boolean isProduce = false;

    public void produce() {
        synchronized (LOCK) {
            if (isProduce) {
                try {
                    LOCK.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                i++;
                System.out.println("P -> " + i);
                isProduce = true;
                LOCK.notify();
            }
        }
    }

    public void consumer() {
        synchronized (LOCK) {
            if (isProduce) {
                System.out.println("C -> " + i);
                isProduce = false;
                LOCK.notify();
            } else {
                try {
                    LOCK.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        ConsumerAndConsumer ps = new ConsumerAndConsumer();
        new Thread() {
            @Override
            public void run() {
                while (true) {
                    ps.consumer();
                }
            }
        }.start();


        new Thread() {
            @Override
            public void run() {
                while (true) {
                    ps.produce();
                }
            }
        }.start();
    }
}
