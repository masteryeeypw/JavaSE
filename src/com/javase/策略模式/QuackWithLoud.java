package com.javase.策略模式;

/**
 * Created by Yipw on 2018/9/11 0011.
 * 大声叫
 */
public class QuackWithLoud implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("大声叫");
    }
}
