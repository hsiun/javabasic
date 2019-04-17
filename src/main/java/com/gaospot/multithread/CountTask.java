package com.gaospot.multithread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.RecursiveTask;

/**
 * @author: gaoxiong@asiainfo.com
 * @date: 2019/1/29 4:03 PM
 * @description: Fork/Join框架测试
 *
 * 其实Fork/Join框架就是提供一种方法是的使用多个线程完成一个任务变得更简单了。
 *
 * 猜测应该是用多线程去执行递归的方法，可以加快递归方法执行速度
 */

public class CountTask extends RecursiveTask<Integer> {

    private static final int COUNT = 2;
    private int start;
    private int end;

    public CountTask(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {

        int sum = 0;

        //如大于2就分割
        if ((end - start) <= COUNT) {
            for (int i = start; i <= end; i++) {
                sum += i;
            }
        } else {
            int middle = (end - start) / 2;
            CountTask left = new CountTask(start, middle);
            CountTask right = new CountTask(middle + 1, end);
            left.fork();
            right.fork();


            int leftResult = left.join();
            int rightResult = right.join();

            sum = leftResult + rightResult;
        }

        return sum;
    }

    public static void main(final String[] args) {
        ForkJoinPool pool = new ForkJoinPool();

        CountTask countTask = new CountTask(1, 4);

        Future<Integer> result = pool.submit(countTask);


        try {
            System.out.println("result.get() = " + result.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        pool.shutdown();
    }


}
