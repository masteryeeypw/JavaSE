package com.javase.H模式方法模式;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author MASTERYEE
 * @Date 2018/9/28 20:30
 **/
public class ArraysSortTest {

    public static void main(String[] args) {
        Duck[] ducks = {
                new Duck("1", 3),
                new Duck("2", 6),
                new Duck("3", 11),
                new Duck("4", 9),
                new Duck("5", 8),
                new Duck("6", 77),
                new Duck("7", 5),
                new Duck("8", 2),
        };

        System.out.println(Arrays.toString(ducks));

        //Arrays.sort(ducks);


        Arrays.sort(ducks, new Comparator<Duck>() {
            @Override
            public int compare(Duck o1, Duck o2) {
                return o1.weight - o2.weight;
            }
        });
        System.out.println(Arrays.toString(ducks));
    }

}
