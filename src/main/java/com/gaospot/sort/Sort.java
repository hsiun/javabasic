package com.gaospot.sort;

/**
 * @author: gaoxiong@asiainfo.com
 * @date: 2019/4/30 9:40 AM
 * @description:
 */

public class Sort {


    /**
     * 简单选择排序也比较简单。
     * 在前面的n个数中查找最小的那个数放在当前位置
     * 在剩下的数中找最小的那个数放在当前位置
     * @param a
     */
    public void selectSort(int[] a) {
        int length = a.length;

        for (int i = 0 ; i<length; i++) {
            int currentValue = a[i];
            int currentPosiontion = i;
            for (int j= i+1; j<length; j++) {
                if (a[j] < currentValue) {
                    currentValue = a[j];
                    currentPosiontion = j;
                }
            }
            //循环结束就找到了后面的最小值，可以交换了
            a[currentPosiontion] = a[i];
            a[i] = currentValue;
        }

    }


    /**
     * 插入排序的思路比较简单。首先认为数组的前n个数是已排序的，
     * 当循环遍历到第n个数的时候，把这个数向前插入到前面已排序的数组中
     *
     * @param a
     */
    public void insertSort(int[] a) {
        int length = a.length;
        int current;

        for (int i=1; i<length; i++) {
            current = a[i];
            //前面有i-1个元素
            int j = i - 1;
            while (j > 0 && a[j] > current) {
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = current;
        }
    }
}
