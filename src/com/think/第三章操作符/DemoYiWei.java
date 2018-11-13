package com.think.第三章操作符;

/**
 * Created by Yipw on 2018/11/13 0013.
 */
public class DemoYiWei {

    public static void main(String[] args) {
        int i = -1;
        System.out.println(Integer.toBinaryString(i));
        i >>>= 10;
        System.out.println(Integer.toBinaryString(i));
    }
}
