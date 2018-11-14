package com.think.第五章初始化与清理;

/**
 * Created by Yipw on 2018/11/14 0014.
 */
public class Hourse {

    Window w1 = new Window(1);

    Hourse() {
        System.out.print("构造器: ");
        Window w2 = new Window(2);
    }

    Window w3 = new Window(3);

    static {
        System.out.print("静态域: ");
        Window w5 = new Window(5);
    }

    public static void test() {
        System.out.print("静态方法: ");
        Window w4 = new Window(4);
    }

}
