package com.gaospot.design.bridge;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-08-06 17:48
 */

public class TCL extends TV {
    @Override
    void on() {
        System.out.println("TCL on");
    }

    @Override
    void off() {
        System.out.println("TCL off");
    }

    @Override
    void trunChannel() {
        System.out.println("TCL turn channel");
    }
}
