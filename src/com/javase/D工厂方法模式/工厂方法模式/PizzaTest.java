package com.javase.D工厂方法模式.工厂方法模式;

/**
 * Created by Yipw on 2018/9/20 0020.
 */
public class PizzaTest {

    public static void main(String[] args) {
        // 开一家纽约披萨加盟店
        PizzaStore nyStore = new NewYorkStylePizzaStore();

        // 开一家芝加哥披萨加盟店
        PizzaStore chicagoStore = new ChicagokStylePizzaStore();

        Pizza nyCheesePizza = nyStore.orderPizza("cheese");
        System.out.println("张三定纽约芝士披萨: " + nyCheesePizza.toString());
        Pizza chicagoMilkPizza = chicagoStore.orderPizza("milk");
        System.out.println("李四定芝加哥牛奶披萨: " + chicagoMilkPizza.toString());
    }

}
