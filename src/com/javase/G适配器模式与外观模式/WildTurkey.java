package com.javase.G适配器模式与外观模式;

/**
 * @Author MASTERYEE
 * @Date 2018/9/27 22:09
 **/
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("gobble");
    }

    @Override
    public void fly() {
        System.out.println("小鸡在飞");
    }
}
