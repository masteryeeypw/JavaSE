package com.javase.I建造者模式.建造者模式Ⅱ;

/**
 * Created by Yipw on 2018/10/18 0018.
 * 热牛奶建造器具体实现
 */
public class HotMilkBuilder implements Builder {

    private Product product = new Product();

    @Override
    public void addWater() {
        product.setWater("加热水");
    }

    @Override
    public void addMilk() {
        product.setMilk("加牛奶");
    }

    @Override
    public Product getProduct() {
        return product;
    }
}
