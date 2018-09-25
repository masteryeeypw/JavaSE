package com.javase.E单例模式;

/**
 * Created by Yipw on 2018/9/21 0021.
 */
public class Demo {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            new ThreadDemo().start();
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

}
