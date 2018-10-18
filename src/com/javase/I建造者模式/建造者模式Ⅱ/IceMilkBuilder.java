package com.javase.I建造者模式.建造者模式Ⅱ;

/**
 * Created by Yipw on 2018/10/18 0018.
 * 冰牛奶建造器具体实现
 */
public class IceMilkBuilder implements Builder {

    private Product product = new Product();

    @Override
    public void addWater() {
        product.setWater("加冰水");
    }

    @Override
    public void addMilk() {
        product.setMilk("牛奶");
    }

    @Override
    public Product getProduct() {
        return product;
    }
}
