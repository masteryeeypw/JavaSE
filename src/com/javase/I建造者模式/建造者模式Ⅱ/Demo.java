package com.javase.I建造者模式.建造者模式Ⅱ;

/**
 * Created by Yipw on 2018/10/18 0018.
 */
public class Demo {

    public static void main(String[] args) {
        Director director = new Director();
        // 生成热牛奶

        director.produce(new HotMilkBuilder());
        Product result = director.getResult();
        System.out.print("热牛奶");
        System.out.println(result.toString());

        director.produce(new IceMilkBuilder());
        Product result1 = director.getResult();
        System.out.print("冰牛奶:  ");
        System.out.println(result1.toString());
    }

}
