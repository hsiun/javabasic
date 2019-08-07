package com.gaospot.future;

import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-08-04 17:31
 */

public class Shop {


    String name;

    public Shop(String name) {
        this.name = name;
    }

    Random random = new Random();

    public static void delay() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public String getPrice(String name) {
        System.out.println("name = " + name);
        delay();
        Double price = random.nextDouble() * 100;
        Discount discount = Discount.values()[random.nextInt(Discount.values().length)];
        return String.format("%s:%.2f:%s", getName(), price, discount);
    }

    public Future<String> getPriceAsync(String name) {
        return CompletableFuture.supplyAsync(() -> getPrice("xxxx"));
    }

    public static void main(String[] args) throws Exception{
        Shop shop = new Shop("xxx");
        Long start = System.currentTimeMillis();
        System.out.println("start time:" + System.currentTimeMillis());
        Future<String> price = shop.getPriceAsync("aaa");
        System.out.println("start time:" + (System.currentTimeMillis() - start));
        String aDouble = price.get();
        System.out.println("aDouble = " + aDouble);
        System.out.println("start time:" + (System.currentTimeMillis() - start));

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
