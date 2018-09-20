package com.javase.D工厂方法模式.工厂方法模式;

/**
 * Created by Yipw on 2018/9/20 0020.
 * 芝加哥风味的 牛奶披萨
 */
public class ChicagoStyleMilkPizza extends Pizza {

    public ChicagoStyleMilkPizza() {
        name = "芝加哥牛奶披萨";
        price = 9D;
        sauce = "加了一点点牛奶";
        topping.add("披萨上加了好多鸡肉");
    }

}
