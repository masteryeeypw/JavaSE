package com.javase.A策略模式;

/**
 * Created by Yipw on 2018/9/11 0011.
 * 无法飞行行为
 */
public class NoFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("无法飞行");
    }
}
