package com.javase.D工厂方法模式.工厂方法模式;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yipw on 2018/9/20 0020.
 * 披萨超类, 定义披萨对象
 */
public abstract class Pizza {

    // 名称
    String name;
    // 价格
    double price;
    // 酱料
    String sauce;
    // 一套佐料
    List topping = new ArrayList();

    void prepare() {
        System.out.println("正在准备披萨原料");
    }

    void bake() {
        System.out.println("正在烘烤披萨");
    }

    void cut() {
        System.out.println("正在切片披萨");
    }

    void box() {
        System.out.println("正在打包披萨");
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", sauce='" + sauce + '\'' +
                ", topping=" + topping +
                '}';
    }
}
