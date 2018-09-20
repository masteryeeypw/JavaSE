package com.javase.D工厂方法模式.工厂方法模式;

/**
 * Created by Yipw on 2018/9/20 0020.
 * 芝加哥风味的披萨加盟店 类
 */
public class ChicagokStylePizzaStore extends PizzaStore {

    /**
     * 重写创建披萨的方法
     * @param pizzaType
     * @return
     */
    @Override
    Pizza createPizza(String pizzaType) {
        if ("cheese".equalsIgnoreCase(pizzaType)) {
            return new ChicagoStyleCheesePizza();
        } else if ("milk".equalsIgnoreCase(pizzaType)) {
            return new ChicagoStyleMilkPizza();
        } else {
            return null;
        }
    }
}
