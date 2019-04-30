package com.gaospot.sort;

import java.util.Arrays;
import java.util.Random;

/**
 * @author: gaoxiong@asiainfo.com
 * @date: 2019/4/30 9:36 AM
 * @description: //TODO
 */

public class TestSort {

    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i=1; i<a.length; i++) {
            a[i] = (int) (Math.random()* 100);

        }
        Sort sort = new Sort();

        System.out.println("排序前的数组为：" + Arrays.toString(a));
        int[] insert = Arrays.copyOf(a, a.length);
        sort.insertSort(insert);
        System.out.println("插入排序后的数组为：" + Arrays.toString(insert));


        System.out.println("排序前的数组为：" + Arrays.toString(a));
        int[] select = Arrays.copyOf(a, a.length);
        sort.selectSort(select);
        System.out.println("插入排序后的数组为：" + Arrays.toString(select));

    }
}
