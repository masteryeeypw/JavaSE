package com.javase.策略模式;

/**
 * Created by Yipw on 2018/9/11 0011.
 * 用英语叫的叫行为实现类
 */
public class QuackInEnglish implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("用英语叫");
    }
}
