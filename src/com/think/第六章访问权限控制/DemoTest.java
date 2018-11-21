package com.think.第六章访问权限控制;

/**
 * Created by Yipw on 2018/11/16 0016.
 */
public class DemoTest {

    public static void main(String[] args) {
        DemoPackage p = new DemoPackage();
        DemoProtected demoProtected = new DemoProtected();
        demoProtected.i = 1;
    }
}
