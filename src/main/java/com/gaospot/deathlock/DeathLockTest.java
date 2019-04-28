package com.gaospot.deathlock;

/**
 * @author: gaoxiong@asiainfo.com
 * @date: 2019/4/23 8:30 AM
 * @description: //TODO
 */

public class DeathLockTest {
    public static void main(String[] args) {
        DeathLock2 deathLock2 = new DeathLock2();
        DeathLock1 deathLock1 = new DeathLock1(deathLock2);
        deathLock2.setDeathLock1(deathLock1);

        new Thread() {
            @Override
            public void run() {
                while (true) {
                    deathLock1.m1();
                }
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                while (true) {
                    deathLock2.m2();
                }
            }
        }.start();
    }
}
