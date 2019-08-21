package com.gaospot.design.visitor;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-08-16 10:29
 */

public interface Element {

    void accept(Visitor visitor);
}
