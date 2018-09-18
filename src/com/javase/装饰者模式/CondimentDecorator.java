package com.javase.装饰者模式;

/**
 * Created by Yipw on 2018/9/17 0017.
 * 调料抽象类装饰者
 * 必须让CondimentDecorator能取代Beverage, 所以CondimentDecorator扩展自Beverage类
 */
public abstract class CondimentDecorator extends Beverage {

    /**
     * 所有的调料装饰者必须要重新实现getDescription()方法
     * @return
     */
    public abstract String getDescription();

}
