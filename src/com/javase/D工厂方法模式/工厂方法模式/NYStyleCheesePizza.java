package com.javase.D工厂方法模式.工厂方法模式;

/**
 * Created by Yipw on 2018/9/20 0020.
 * 纽约类型的芝士披萨
 */
public class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza() {
        name = "纽约奶酪披萨";
        price = 10D;
        sauce = "加了一点点芝士";
        topping.add("披萨上加了好多辣椒酱");
    }
}
