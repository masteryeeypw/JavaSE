package com.javase.D工厂方法模式.工厂方法模式;

/**
 * Created by Yipw on 2018/9/20 0020.
 * 这是一个披萨店的抽象类
 */
public abstract class PizzaStore {


    /**
     * 披萨店下订单方法, 希望各地区所有的加盟披萨店都使用的是这个披萨的处理方法, 所以定义在披萨店抽象类中
     * @param pizzaType
     * @return
     */
    public Pizza orderPizza(String pizzaType) {
        Pizza pizza;
        pizza = createPizza(pizzaType);
        // 准备披萨
        pizza.prepare();
        // 烘烤
        pizza.bake();
        // 切片
        pizza.cut();
        // 打包
        pizza.box();
        return pizza;
    }

    /**
     * 抽象方法, 创建披萨
     * 每个加盟店可能创建的方式不太一样, 所以使用抽象方法, 所有的加盟店都必须要重写此方法
     *
     * @param pizzaType
     * @return
     */
    abstract Pizza createPizza(String pizzaType);

}
