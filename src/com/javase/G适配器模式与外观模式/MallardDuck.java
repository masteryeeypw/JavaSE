package com.javase.G适配器模式与外观模式;

/**
 * @Author MASTERYEE
 * @Date 2018/9/27 22:08
 **/
public class MallardDuck implements Duck {

    @Override
    public void quack() {
        System.out.println("quack");
    }

    @Override
    public void fly() {
        System.out.println("fly");
    }
}
