package com.gaospot.threadstate;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-08-12 14:12
 */

public class IOThread extends Thread {

    public IOThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("在run方法体内，现在的状态是" + getState());

        Socket socket = new Socket();

        try {
            System.out.println("尝试连接到主机");
            socket.connect(new InetSocketAddress(InetAddress.getByAddress(new byte[] { (byte) 192, (byte) 168, 1, 14 }), 5678));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
