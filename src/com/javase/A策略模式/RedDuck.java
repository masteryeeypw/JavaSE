package com.javase.A策略模式;

/**
 * Created by Yipw on 2018/9/11 0011.
 */
public class RedDuck extends Duck {

    public static void main(String[] args) {
        RedDuck redDuck = new RedDuck();
        redDuck.setFlyBehavior(new FlyWithWing());
        redDuck.setQuackBehavior(new QuackInEnglish());
        redDuck.duckFly();
        redDuck.quack();

        redDuck.setFlyBehavior(new NoFly());
        redDuck.setQuackBehavior(new QuackWithLoud());
        redDuck.duckFly();
        redDuck.quack();
    }

}
