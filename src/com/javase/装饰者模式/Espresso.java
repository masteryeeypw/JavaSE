package com.javase.装饰者模式;

/**
 * Created by Yipw on 2018/9/17 0017.
 * 浓缩咖啡, 扩展自Beverage, 所以也是一种饮料
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
