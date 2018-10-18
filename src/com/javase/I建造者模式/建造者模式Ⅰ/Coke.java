package com.javase.I建造者模式.建造者模式Ⅰ;

/**
 * Created by Yipw on 2018/10/18 0018.
 */
public class Coke extends ColdDrink {

    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}