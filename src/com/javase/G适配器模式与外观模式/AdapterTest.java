package com.javase.G适配器模式与外观模式;

/**
 * @Author MASTERYEE
 * @Date 2018/9/27 22:28
 **/
public class AdapterTest {

    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        System.out.print("鸭子: ");
        mallardDuck.fly();
        mallardDuck.quack();

        Turkey wildTurkey = new WildTurkey();
        System.out.print("火鸡: ");
        wildTurkey.fly();
        wildTurkey.gobble();

        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);
        System.out.print("适配器后的火鸡:");
        turkeyAdapter.fly();
        turkeyAdapter.quack();
    }

}
