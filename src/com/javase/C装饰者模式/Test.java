package com.javase.C装饰者模式;

/**
 * Created by Yipw on 2018/9/17 0017.
 */
public class Test {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + ", 人民币: " + beverage.cost());

        Beverage beverage1 = new HouseBlend();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Soy(beverage1);
        beverage1 = new Milk(beverage1);

        System.out.println(beverage1.getDescription() + ", 人民币: " + beverage1.cost());

    }
}
