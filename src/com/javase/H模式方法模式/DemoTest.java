package com.javase.H模式方法模式;

/**
 * Created by Yipw on 2018/9/28 0028.
 */
public class DemoTest {

    public static void main(String[] args) {

        System.out.println("喝牛奶:");
        Drink mikl = new Milk();
        mikl.drinking();

        System.out.println("饮茶:");
        Drink tea = new Tea();
        tea.drinking();

    }
}
