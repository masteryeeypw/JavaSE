package com.think.第五章初始化与清理;

import com.think.第六章访问权限控制.DemoProtected;

/**
 * Created by Yipw on 2018/11/14 0014.
 */
public class StaticInitDemo extends DemoProtected {
    public static void main(String[] args) {
        Bowl bowl = new Bowl(1);
        DemoProtected demoProtected = new DemoProtected();
        /*System.out.println("测试的main方法");
        new Cupboard();
        System.out.println("=====================");
        new Cupboard();
        table.f2(1);
        cupboard.f3(2);*/
    }

    public void test() {
        DemoProtected demoProtected = new DemoProtected();
        demoProtected.j = 1;
    }

    //static Table table = new Table();
    //static Cupboard cupboard = new Cupboard();
}
