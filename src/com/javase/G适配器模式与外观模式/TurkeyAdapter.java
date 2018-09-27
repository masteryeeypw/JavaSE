package com.javase.G适配器模式与外观模式;

/**
 * @Author MASTERYEE
 * @Date 2018/9/27 22:10
 **/
public class TurkeyAdapter implements Duck {

    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        turkey.fly();
    }
}
