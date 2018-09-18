package com.javase.装饰者模式;

/**
 * Created by Yipw on 2018/9/17 0017.
 * 这是另一种饮品
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "HouseBlend";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
