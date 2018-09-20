package com.javase.D工厂方法模式.简单工厂模式第一版;

/**
 * Created by Yipw on 2018/1/27 0027.
 * 简单运算工厂
 */
public class OperationFactory {


    public static Operation createOperation(String operationalCharacter) {
        Operation operation = null;
        switch (operationalCharacter) {
            case "+":
                operation = new AddOperation();
                break;
            case "-":
                operation = new SubOperation();
                break;
            case "*":
                operation = new MulOperation();
                break;
            case "/":
                operation = new DivOperation();
                break;
            default:
                break;
        }
        return operation;
    }


}
