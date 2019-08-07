package com.gaospot.design.builder;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-08-05 16:59
 */

public class StringBuilder extends AbstractStringBuilder {


    public StringBuilder(int initSize) {
        super(initSize);
    }

    @Override
    public String toString() {
        return new String(value, 0, count);
    }
}
