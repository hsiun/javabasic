package com.gaospot.design.bridge;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-08-06 17:50
 */

public abstract class RemoteControlor {

    protected TV tv;

    public RemoteControlor(TV tv) {
        this.tv = tv;
    }

    public abstract void on();

    public abstract void off();

    public abstract void trunChannel();
}
