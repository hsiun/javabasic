package com.gaospot.future;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-08-04 18:23
 */

public enum Discount {
    NONE(0), GOLD(2), VIP(5);

    private final int price;

    Discount(int price) {
        this.price = price;
    }
}
