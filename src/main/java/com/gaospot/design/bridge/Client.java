package com.gaospot.design.bridge;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-08-06 17:54
 */

public class Client {
    public static void main(String[] args) {
        Sony sony = new Sony();
        RemoteControlor controlor = new SonyControlor(sony);
        controlor.on();
        controlor.trunChannel();
        controlor.off();
    }
}
