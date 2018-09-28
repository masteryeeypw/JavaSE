package com.javase.H模式方法模式;

/**
 * Created by Yipw on 2018/9/28 0028.
 * 饮品抽象类, 定义一个模版方法
 */
public abstract class Drink {

    final void drinking() {
        boilingWater();
        addCondiment();
        pourInCup();
    }


    void boilingWater() {
        System.out.println("烧水");
    }


    void pourInCup() {
        System.out.println("冲水");
    }

    /**
     * 添加调料
     */
    abstract void addCondiment();
}
