package com.javase.I建造者模式.建造者模式Ⅰ;

/**
 * Created by Yipw on 2018/10/18 0018.
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}