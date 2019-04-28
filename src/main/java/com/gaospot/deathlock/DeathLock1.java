package com.gaospot.deathlock;

/**
 * @author: gaoxiong@asiainfo.com
 * @date: 2019/4/23 8:12 AM
 * @description: //TODO
 */

public class DeathLock1 {

    private Object lock = new Object();

    private DeathLock2 deathLock2;

    public DeathLock1(DeathLock2 deathLock2) {
        this.deathLock2 = deathLock2;
    }

    public void m1() {
        synchronized (lock) {
            System.out.println("m1=========");
            deathLock2.m1();
        }
    }


    public void m2() {
        synchronized (lock) {
            System.out.println("m2==========");
        }
    }
}
