package com.think.第五章初始化与清理;

/**
 * Created by Yipw on 2018/11/14 0014.
 */
public class Bowl {
    Bowl(int i) {
        System.out.println("Bowl构造器: " + i);
    }

    static {
        System.out.println("Bowl的静态域");
    }

    void f1(int i) {
        System.out.println("Blwl中普通方法: f1(" + i + ")");
    }
}
