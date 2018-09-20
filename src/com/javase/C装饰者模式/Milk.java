package com.javase.C装饰者模式;

/**
 * Created by Yipw on 2018/9/17 0017.
 * 牛奶装饰者
 */
public class Milk extends CondimentDecorator {

    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 2 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }
}
