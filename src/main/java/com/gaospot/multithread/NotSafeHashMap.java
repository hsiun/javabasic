package com.gaospot.multithread;

import java.util.HashMap;
import java.util.UUID;

/**
 * @author: gaoxiong@asiainfo.com
 * @date: 2019/1/30 9:36 AM
 * @description: 测试HashMap在多线程的情况下出现死循环
 *
 * 结果：未观察到死循环
 */

public class NotSafeHashMap {

    /**
     * 主方法。
     * @param args
     * 输入参数
     */
    public static void main(final String[] args) {
        final HashMap<String, String> map = new HashMap<>();

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            map.put(UUID.randomUUID().toString(), "");
                        }
                    }, "inner thread " + i).start();
                }
            }
        }, "outer thread ");

        thread.start();
        joinWapper(thread);
    }

    /**
     * 对异常处理进行封装.
     * @param thread 线程
     */
    private static void joinWapper(final Thread thread) {
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
