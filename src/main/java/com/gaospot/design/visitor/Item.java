package com.gaospot.design.visitor;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-08-16 10:32
 */

public class Item implements Element{

    private String name;

    Item(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
