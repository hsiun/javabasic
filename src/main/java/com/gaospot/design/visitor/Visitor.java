package com.gaospot.design.visitor;



/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-08-16 10:30
 */

public interface Visitor {

    void visit(Customer customer);

    void visit(Order order);

    void visit(Item item);


}
