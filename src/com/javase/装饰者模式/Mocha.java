package com.javase.装饰者模式;

/**
 * Created by Yipw on 2018/9/17 0017.
 * 摩卡是一个装饰者, 所以让它扩展自CondimentDecorator
 * CondimentDecorator扩展自Beverage
 */
public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 1 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

}
