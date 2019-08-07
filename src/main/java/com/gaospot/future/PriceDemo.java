package com.gaospot.future;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-08-04 17:48
 */

public class PriceDemo {

    private List<Shop> list = Arrays.asList(
            new Shop("shop1"),
            new Shop("shop2"),
            new Shop("shop3"),
            new Shop("shop4"),
            new Shop("shop5"),
            new Shop("shop6"),
            new Shop("shop7"),
            new Shop("shop8")
            );

    public List<String> findPrice1(String product) {
        return list.stream().parallel().map(shop -> String.format("%s price is %.2f", shop.getName(), shop.getPrice(product)))
                .collect(Collectors.toList());
    }


    public List<String> findPrice(String product) {
        ExecutorService executor = Executors.newFixedThreadPool(Math.min(list.size(), 100));

        List<CompletableFuture<String>> collect = list.stream().parallel().map(shop -> CompletableFuture.supplyAsync(
                () -> String.format("%s price is %.2f", shop.getName(), shop.getPrice(product)), executor))
                .collect(Collectors.toList());


        return collect.stream().map(CompletableFuture::join).collect(Collectors.toList());
    }
    public static void main(String[] args) {

        System.out.println(Runtime.getRuntime().availableProcessors());
        long start = System.currentTimeMillis();
        PriceDemo demo = new PriceDemo();

        System.out.println(demo.findPrice("iphone xr"));

        System.out.println(System.currentTimeMillis() - start);

    }
}
