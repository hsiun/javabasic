package com.gaospot.design.bridge;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-08-06 17:47
 */

public class Sony extends TV {
    @Override
    void on() {
        System.out.println("Sony on");
    }

    @Override
    void off() {
        System.out.println("Sony off");
    }

    @Override
    void trunChannel() {
        System.out.println("Sony trun channel");
    }
}
