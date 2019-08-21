package com.gaospot.design.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-08-16 10:33
 */

public class CustomerGroup {

    private List<Customer> customers = new ArrayList<>();

    void accept(Visitor visitor) {
        for (Customer customer : customers) {
            customer.accept(visitor);
        }
    }

    void addCustomer(Customer customer) {
        customers.add(customer);
    }
}
