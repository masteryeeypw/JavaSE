package com.javase.D工厂方法模式.简单工厂模式第一版;

/**
 * Created by Yipw on 2018/1/27 0027.
 * 运算类, 做抽象类使用
 */
public abstract class Operation {


    private double numberOne = 0;
    private double numberTwo = 0;

    public double getNumberOne() {
        return numberOne;
    }

    public void setNumberOne(double numberOne) {
        this.numberOne = numberOne;
    }

    public double getNumberTwo() {
        return numberTwo;
    }

    public void setNumberTwo(double numberTwo) {
        this.numberTwo = numberTwo;
    }

    public abstract double getResult();
}
