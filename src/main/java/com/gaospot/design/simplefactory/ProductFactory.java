package com.gaospot.design.simplefactory;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-08-05 16:11
 */

public class ProductFactory {

    public Product createProduct(int type) {
        if (type == 1) {
            return new ProductImpl1();
        } else {
            return new ProductImpl2();
        }
    }
}
