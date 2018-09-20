package com.javase.D工厂方法模式.工厂方法模式;

/**
 * Created by Yipw on 2018/9/20 0020.
 * 纽约类型的榴莲披萨
 */
public class NYStyleDurianPizza extends Pizza {

    public NYStyleDurianPizza() {
        name = "纽约榴莲披萨";
        price = 20D;
        sauce = "加了一点点芝士";
        topping.add("披萨上加了好多榴莲");
    }
}
