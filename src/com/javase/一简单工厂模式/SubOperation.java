package com.javase.一简单工厂模式;

/**
 * Created by Yipw on 2018/1/27 0027.
 * 减法运算类
 */
public class SubOperation extends Operation {


    @Override
    public double getResult() {
        double result;
        result = getNumberOne() - getNumberTwo();
        return result;
    }
}
