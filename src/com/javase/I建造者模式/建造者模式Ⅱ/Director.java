package com.javase.I建造者模式.建造者模式Ⅱ;

/**
 * Created by Yipw on 2018/10/18 0018.
 * 监察者对象, 指挥者对象, 监工, 调用建造者对象建造方法, 具体的建造流程在这里决定
 */
public class Director {

    private Builder builder;
    /**
     * 生成产品的流程, 先加牛奶还是先加水, 而且规定了一定要加牛奶和水, 不会漏步骤
     * @param builder
     */
    public void produce(Builder builder) {
        this.builder = builder;
        builder.addMilk();
        builder.addWater();
    }


    /**
     * 获取产品
     * @return
     */
    public Product getResult() {
        return this.builder.getProduct();
    }




}
