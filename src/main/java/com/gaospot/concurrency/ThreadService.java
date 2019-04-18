package com.gaospot.concurrency;

/**
 * @author: gaoxiong@asiainfo.com
 * @date: 2019/4/18 8:35 AM
 * @description: 强制停止进程
 */

public class ThreadService {
    boolean finished = false;
    Thread executeThread;

    public void execute(Runnable task) {
        executeThread = new Thread(){
            @Override
            public void run() {
                Thread runner = new Thread(task);
                runner.setDaemon(true);
                runner.start();
                try {
                    runner.join();
                    finished = true;
                } catch (InterruptedException e) {
                    //e.printStackTrace();
                }
            }
        };

        executeThread.start();
    }

    public void shutdown(long mils) {
        long start = System.currentTimeMillis();
        while (!finished) {
            if (System.currentTimeMillis() - start > mils) {
                System.out.println("任务超时，停止任务线程...");
                executeThread.interrupt();
                break;
            }

            try {
                //让出cpu执行权限？
                executeThread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
