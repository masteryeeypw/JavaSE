package com.think.第三章操作符;

import java.util.Random;

/**
 * Created by Yipw on 2018/11/13 0013.
 */
public class DemoRandom {

    public static void main(String[] args) {
        Random random = new Random(46);
        for (int i = 0; i < 10; i++) {
            int j = random.nextInt(100);
            System.out.println(j);
        }
    }
}
