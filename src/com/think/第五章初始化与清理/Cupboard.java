package com.think.第五章初始化与清理;

/**
 * Created by Yipw on 2018/11/14 0014.
 */
public class Cupboard {

    Bowl bow3 = new Bowl(3);
    static Bowl bow4 = new Bowl(4);

    Cupboard() {
        System.out.println("Cupboard构造器: ");
        bow4.f1(2);
    }

    void f3(int i) {
        System.out.println("Cupboard中普通方法: f3(" + i + ")");
    }

    static Bowl bow5 = new Bowl(5);
}
