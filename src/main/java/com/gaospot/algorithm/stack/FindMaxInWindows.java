package com.gaospot.algorithm.stack;

/**
 * @author: gaoxiong@asiainfo.com
 * @date: 2019/3/4 3:07 PM
 * @description: 查找窗口内最大值
 */

public class FindMaxInWindows {

    public int[] findMaxInwindows(int[] arr, int w) {
        int[] result = new int[arr.length - w + 1];
        if (arr.length > w) {
            int max = findMaxInW(arr, w);
            for (int i = w; i < arr.length; i++) {
                if (arr[w] > max) {
                    max = arr[w];
                } else {
                    //如果arr[w]不是最大的，就比较麻烦了，这个方法不可以
                }
                result[i - w] = max;
            }
        } else {
            result = null;
        }
        return result;
    }


    public int findMaxInW(int[] arr, int w) {
        int result = 0;
        for (int i = 0; i < w; i++) {
            if (arr[i] > result) {
                result = arr[i];
            }
        }
        return result;
    }

}
