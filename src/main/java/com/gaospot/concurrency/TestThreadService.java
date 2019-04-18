package com.gaospot.concurrency;

/**
 * @author: gaoxiong@asiainfo.com
 * @date: 2019/4/18 9:17 AM
 * @description: //TODO
 */

public class TestThreadService {


    public static void main(String[] args) {
        ThreadService threadService = new ThreadService();
        long start = System.currentTimeMillis();
        threadService.execute(() -> {
            while (true) {
                //to do something
            }
        });
        threadService.shutdown(10000);
        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }
}
