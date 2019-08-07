package com.gaospot.design.iterator;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-08-06 11:01
 */

public interface Iterator<Item> {

    Item next();

    boolean hasNext();

}
