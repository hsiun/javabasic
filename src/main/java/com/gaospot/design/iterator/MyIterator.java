package com.gaospot.design.iterator;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-08-06 11:03
 */

public class MyIterator<Item> implements Iterator {
    private int position = 0;

    private Item[] items;


    public MyIterator(Item[] items) {
        this.items = items;
    }

    @Override
    public Object next() {
        return items[position++];
    }

    @Override
    public boolean hasNext() {
        return position < items.length;
    }
}
