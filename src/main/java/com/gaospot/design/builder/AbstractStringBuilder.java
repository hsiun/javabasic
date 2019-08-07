package com.gaospot.design.builder;

import java.util.Arrays;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-08-05 16:54
 */

public class AbstractStringBuilder {

    char[] value;
    int count;

    public AbstractStringBuilder(int initSize) {
        count = 0;
        value = new char[initSize];
    }

    public AbstractStringBuilder appender(char c) {
        ensureCapacityInternal(count + 1);
        value[count++] = c;
        return this;
    }

    public void ensureCapacityInternal(int num) {
        if (num - value.length > 0) {
            expandCapacity(num);
        }
    }


    public void expandCapacity(int num) {
        int newCapacity = value.length * 2 + 2;
        if (newCapacity - num < 0)
            newCapacity = num;
        if (newCapacity < 0) {
            if (num < 0) // overflow
                throw new OutOfMemoryError();
            newCapacity = Integer.MAX_VALUE;
        }
        value = Arrays.copyOf(value, newCapacity);
    }

}
