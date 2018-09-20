package com.javase.D工厂方法模式.简单工厂模式第一版;

import java.util.Scanner;

/**
 * Created by Yipw on 2018/1/27 0027.
 */
public class Test {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入运算符");
        String operationStr = sc.next();
        System.out.println("请输入第一位数");
        double numberOne = sc.nextDouble();
        System.out.println("请输入第二位数");
        double numberTwo = sc.nextDouble();
        Operation operation = null;
        operation = OperationFactory.createOperation(operationStr);
        operation.setNumberOne(numberOne);
        operation.setNumberTwo(numberTwo);
        double result = operation.getResult();
        System.out.println(result);
    }
}
