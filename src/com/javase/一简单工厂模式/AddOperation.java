package com.javase.一简单工厂模式;

/**
 * Created by Yipw on 2018/1/27 0027.
 * 加运算类
 */
public class AddOperation extends Operation {

    @Override
    public double getResult() {
        double result;
        result = getNumberOne() + getNumberTwo();
        return result;
    }
}
