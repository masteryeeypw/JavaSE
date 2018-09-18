package com.javase.策略模式;

/**
 * Created by Yipw on 2018/9/11 0011.
 * 鸭子超类
 */
public abstract class Duck {

    private FlyBehavior flyBehavior;

    private QuackBehavior quackBehavior;

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }


    /**
     * 鸭子飞行为方法
     */
    void duckFly() {
        flyBehavior.fly();
    }

    /**
     * 鸭子叫行为方法
     */
    public void quack() {
        quackBehavior.quack();
    }

}
