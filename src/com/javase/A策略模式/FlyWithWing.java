package com.javase.A策略模式;

/**
 * Created by Yipw on 2018/9/11 0011.
 * 用翅膀飞行行为
 */
public class FlyWithWing implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("我用翅膀飞行");
    }
}
