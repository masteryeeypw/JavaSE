package com.think.第三章操作符;

/**
 * Created by Yipw on 2018/11/13 0013.
 */
public class DemoDengYu {

    public static void main(String[] args) {
        Cat c1 = new Cat();
        Cat c2 = new Cat();
        c1.a = 1;
        c2 = c1;
        c2.a = 2;
        System.out.println(c1.a);
        System.out.println(c1);
        System.out.println(c2);

        /*Cat c1 = new Cat();
        c1.a = 1;
        System.out.println(c1);
        test(c1);
        System.out.println(c1.a);
        System.out.println(c1);*/
    }

    public static Cat test(Cat c) {
        c.a = 2;
        return c;
    }

}
