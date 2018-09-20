package com.javase.C装饰者模式;

/**
 * Created by Yipw on 2018/9/17 0017.
 */
public abstract class Beverage {

    String description = "Unknow Beverage";

    public String getDescription() {
        return description;
    }

    /**
     * 价格计算方法
     * @return
     */
    public abstract double cost();
}
