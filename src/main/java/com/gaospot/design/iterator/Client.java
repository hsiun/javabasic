package com.gaospot.design.iterator;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-08-06 11:11
 */

public class Client {


    /**
     * 迭代器，这种实现方式在JDK中有
     * @param args
     */
    public static void main(String[] args) {
        MyList list = new MyArrayList();
        Iterator iterator = list.createIterator();

        while (iterator.hasNext()) {
            System.out.println("iterator = " + iterator.next());
        }
    }
}
