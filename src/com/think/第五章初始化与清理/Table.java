package com.think.第五章初始化与清理;

/**
 * Created by Yipw on 2018/11/14 0014.
 */
public class Table {

    static Bowl bowl = new Bowl(1);

    static {
        System.out.println("Table的静态域");
    }

    Table() {
        System.out.print("Table构造器: ");
        bowl.f1(1);
    }

    void f2(int i) {
        System.out.println("Table中普通方法: f2(" + i + ")");
    }

    static Bowl bow2 = new Bowl(2);

}
