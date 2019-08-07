package com.gaospot.future;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-08-04 17:11
 */

public class FutureDemo {

    public static void main(String[] args) throws Exception{
        ExecutorService executorService = Executors.newCachedThreadPool();
        System.out.println("0start:" + System.currentTimeMillis());
        Future<String> submit = executorService.submit(FutureDemo::doSomethingLongOperation);
        System.out.println("2start:" + System.currentTimeMillis());
        String s = submit.get();
        System.out.println("s = " + s);
        System.out.println("3start:" + System.currentTimeMillis());


    }


    public static String doSomethingLongOperation() throws InterruptedException {
        Thread.sleep(1000);
        return  "xxx";
    }
}
