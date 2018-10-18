package com.javase.I建造者模式.建造者模式Ⅱ;

/**
 * Created by Yipw on 2018/10/18 0018.
 * 建造者接口, 建造者超类, 定义建造产品的所有方法
 */
public interface Builder {

    /**
     * 加水操作
     */
    void addWater();

    /**
     * 加牛奶操作
     */
    void addMilk();

    /**
     * 获取产品的方法
     * @return
     */
    Product getProduct();

}
