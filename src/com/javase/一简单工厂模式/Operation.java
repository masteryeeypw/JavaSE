package com.javase.一简单工厂模式;

/**
 * Created by Yipw on 2018/1/27 0027.
 * 运算类
 */
public class Operation {


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

    public double getResult() {
        return 0;
    }
}
