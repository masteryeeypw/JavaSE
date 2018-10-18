package com.javase.I建造者模式.建造者模式Ⅰ;

/**
 * Created by Yipw on 2018/10/18 0018.
 * 构造者对象, 这里的Meal应该是产品, 就是被构造的对象
 */
public class MealBuilder {

    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }

}
