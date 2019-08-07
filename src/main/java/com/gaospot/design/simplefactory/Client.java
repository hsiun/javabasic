package com.gaospot.design.simplefactory;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-08-05 16:13
 */

public class Client {

    public static void main(String[] args) {

        /**
         * 好吧，我只能说简单工厂模式毫无技术含量
         */

        ProductFactory factory = new ProductFactory();

        Product product = factory.createProduct(1);

        product.sayHello();
    }
}
