package com.java8.实现异步API;

import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

/**
 * @Author MASTERYEE
 * @Date 2018/10/28 20:32
 **/
public class Shop {

    private String produce;

    public Shop(String produce) {
        this.produce = produce;
    }

    public String getProduce() {
        return produce;
    }

    public void setProduce(String produce) {
        this.produce = produce;
    }

    public double getPrice(String product) {
        return calculatePrice(product);
    }

    public Future<Double> getPriceAsync(String produce) {
        /*CompletableFuture<Double> futurePrice = new CompletableFuture<>();
        new Thread( () -> {
            double price = calculatePrice(produce);
            futurePrice.complete(price);
        }).start();
        return futurePrice;*/
        return CompletableFuture.supplyAsync(() -> calculatePrice(produce));
    }

    private double calculatePrice(String product) {
        delay();
        return new Random().nextDouble() * product.charAt(10) + product.charAt(1);
    }

    public static void delay() {
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
