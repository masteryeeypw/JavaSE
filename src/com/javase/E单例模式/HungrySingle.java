package com.javase.E单例模式;

/**
 * Created by Yipw on 2018/9/21 0021.
 * 饿汉式单例模式
 */
public class HungrySingle {

    private static HungrySingle hungrySingle = new HungrySingle();

    private HungrySingle(){}

    public HungrySingle getInstance() {
        return hungrySingle;
    }

}
