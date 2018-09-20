package com.javase.D工厂方法模式.简单工厂模式第一版;

/**
 * Created by Yipw on 2018/1/27 0027.
 * 除法运算
 */
public class DivOperation extends Operation {

    @Override
    public double getResult() {
        double result;
        result = getNumberOne() / getNumberTwo();
        return result;
    }
}
