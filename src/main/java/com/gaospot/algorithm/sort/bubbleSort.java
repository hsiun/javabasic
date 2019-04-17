package com.gaospot.algorithm.sort;

/**
 * @author: gaoxiong@asiainfo.com
 * @date: 2019/4/9 4:50 PM
 * @description: 冒泡排序算法
 */

public class bubbleSort {

    static void bubbleSort(int[] a) {
        int temp = 0;
        int size = a.length - 1;

        for (int i = 0; i < size; i++) {
            for (int j=0; j< size-i; j++) {
                if (a[j] > a[j+1]) {
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }

    }


    public static void main(String[] args) {
        int a[] = {2, 4, 5, 5, 9, 10, 3, 5, 2, 3};
        bubbleSort(a);
        for (int i = 0; i< a.length; i++) {
            System.out.print(a[i]+ ",");
        }
    }
}
