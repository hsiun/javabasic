package com.gaospot.threadstate;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-08-12 15:14
 */

public class JoinThread extends Thread {

    private Thread thread;

    private int timeout = 0;

    public JoinThread(Thread thread, String name) {
        this(thread, 0, name);
    }

    public JoinThread(Thread thread, int timeout, String name) {
        super(name);
        this.thread = thread;
        this.timeout = timeout;
    }

    @Override
    public void run() {
        if (timeout == 0) {
            try {
                System.out.println("准备join");
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            try {
                System.out.println("准备join" + timeout);
                thread.join(timeout);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("joint线程退出");
    }
}
