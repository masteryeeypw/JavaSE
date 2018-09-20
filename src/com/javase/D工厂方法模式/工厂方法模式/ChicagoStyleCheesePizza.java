package com.javase.D工厂方法模式.工厂方法模式;

/**
 * Created by Yipw on 2018/9/20 0020.
 * 芝加哥风味披萨
 */
public class ChicagoStyleCheesePizza extends Pizza {

    public ChicagoStyleCheesePizza() {
        name = "芝加哥奶酪披萨";
        price = 15D;
        sauce = "加了一点点牛头";
        topping.add("披萨上加了好多咖喱");
    }

    /**
     * 覆盖了切披萨的方法, 所以加入了自己的切方法
     */
    @Override
    void cut() {
        System.out.println("我的芝加哥披萨是切成长方形的");
    }
}
