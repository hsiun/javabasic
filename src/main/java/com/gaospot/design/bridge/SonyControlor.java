package com.gaospot.design.bridge;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-08-06 17:52
 */

public class SonyControlor extends RemoteControlor {

    public SonyControlor(TV tv) {
        super(tv);
    }

    @Override
    public void on() {
        System.out.println("SonyControlor on..");
        tv.on();

    }

    @Override
    public void off() {
        System.out.println("SonyControlor off..");
        tv.off();

    }

    @Override
    public void trunChannel() {
        System.out.println("SonyControlor trun channel..");
        tv.trunChannel();
    }
}
