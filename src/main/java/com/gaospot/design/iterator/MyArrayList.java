package com.gaospot.design.iterator;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-08-06 11:07
 */

public class MyArrayList implements MyList {

    private Integer[] integers;


    public MyArrayList() {
        this.integers = new Integer[10];
        for (int i=0; i<10; i++) {
            integers[i] = i;
        }
    }

    @Override
    public Iterator createIterator() {
        return new MyIterator<Integer>(integers);
    }
}
