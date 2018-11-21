package com.think.第二章;

import java.util.Objects;

/**
 * Created by Yipw on 2018/11/19 0019.
 */
public class DemoTest {

    public static void main(String[] args) {
        Good good = new Good();
        good.setOne(1000);
        good.setTwo(2000L);

        Apple apple = new Apple();
        apple.setOne(1000);
        apple.setTwo(2000L);

        System.out.println(good.getOne() == apple.getOne());
        System.out.println(good.getTwo() == apple.getTwo());
        System.out.println(Objects.equals(good.getOne(), apple.getOne()));
        System.out.println(Objects.equals(good.getTwo(), apple.getTwo()));

        Integer a = 128;
        Integer b = 128;
        System.out.println(a == b);
        Long aa = 127L;
        Long bb = 127L;
        System.out.println(aa == bb);
    }

}
