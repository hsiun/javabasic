package com.gaospot.algorithm.search;

/**
 * @author: gaoxiong@asiainfo.com
 * @date: 2019/4/9 4:06 PM
 * @description: 二分查找算法，二分查找只能用于排序列表
 */

public class binarySearch {

    static int binarySearch(int a[], int key) {
        int left = 0;
        int right = a.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (a[mid] == key) {
                return mid;
            } else if (a[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3, 4, 5, 6};

        System.out.println("a = " + binarySearch(a, 3));
    }
}
