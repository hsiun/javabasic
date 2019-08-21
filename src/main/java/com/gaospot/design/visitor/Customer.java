package com.gaospot.design.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-08-16 10:33
 */

public class Customer implements Element {

    private String name;
    private List<Order> orders = new ArrayList<>();

    Customer(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void addOrder(Order order) {
        orders.add(order);
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
        for (Order order : orders) {
            order.accept(visitor);
        }
    }
}
