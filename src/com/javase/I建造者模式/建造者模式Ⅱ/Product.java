package com.javase.I建造者模式.建造者模式Ⅱ;

/**
 * Created by Yipw on 2018/10/18 0018.
 * 产品角色,产品对象, 需要被创建的对象, 等待被创建的对象
 */
public class Product {

    private String water;
    private String milk;

    @Override
    public String toString() {
        return "Product{" +
                "water='" + water + '\'' +
                ", milk='" + milk + '\'' +
                '}';
    }

    public String getWater() {
        return water;
    }

    public void setWater(String water) {
        this.water = water;
    }

    public String getMilk() {
        return milk;
    }

    public void setMilk(String milk) {
        this.milk = milk;
    }
}
