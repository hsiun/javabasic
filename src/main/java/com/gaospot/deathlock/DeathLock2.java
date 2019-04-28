package com.gaospot.deathlock;

/**
 * @author: gaoxiong@asiainfo.com
 * @date: 2019/4/23 8:12 AM
 * @description: //TODO
 */

public class DeathLock2 {

    private Object lock2 = new Object();

    private DeathLock1 deathLock1;


    public void m1() {
        synchronized (lock2) {
            System.out.println("lock2 m1+++++++++++");
        }
    }

    public void m2() {
        synchronized (lock2) {
            System.out.println("lock2 m2++++++++++++");
            deathLock1.m2();
        }
    }

    public DeathLock1 getDeathLock1() {
        return deathLock1;
    }

    public void setDeathLock1(DeathLock1 deathLock1) {
        this.deathLock1 = deathLock1;
    }
}
