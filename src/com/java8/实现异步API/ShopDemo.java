package com.java8.实现异步API;

import java.util.concurrent.Future;

/**
 * @Author MASTERYEE
 * @Date 2018/10/28 20:39
 **/
public class ShopDemo {

    public static void main(String[] args) {
        Shop shop = new Shop("BestShop");
        long start = System.nanoTime();
        Future<Double> futurePrice = shop.getPriceAsync("my favorite product");
        long invocationTime = ((System.nanoTime() - start) / 1_000_000);
        System.out.println("使用时间: " + invocationTime);

        try {
            double price = futurePrice.get();
            System.out.println(price);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        long invocationTime1 = ((System.nanoTime() - start) / 1_000_000);
        System.out.println("使用时间: " + invocationTime1);
    }

}
