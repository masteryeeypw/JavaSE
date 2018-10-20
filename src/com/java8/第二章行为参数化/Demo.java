package com.java8.第二章行为参数化;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @Author MASTERYEE
 * @Date 2018/10/15 20:58
 **/
public class Demo {

    public static void main(String[] args) {
        List<Apple> inventory = Arrays.asList(new Apple(80, "green"),
                new Apple(100, "red"), new Apple(160, "green"));
        //List<Apple> apples = filterApples(inventory, new AppleHeavyWeightPredicate());
        //List<Apple> apples1 = filterApples(inventory, new AppleGreenColorPredicate());

        List<Apple> apples2 = filterApples(inventory, new Predicate<Apple>() {
            @Override
            public boolean test(Apple apple) {
                return "red".equals(apple.getColor());
            }
        });

        List<Apple> apples3 = filterApples(inventory, (Apple apple) -> "red".equals(apple.getColor()));

        List<Integer> numbers = Arrays.asList(new Integer(1), new Integer(20), new Integer(21));
        List<Integer> integers = filterApples(numbers, (Integer i) -> i % 2 == 0);

        inventory.sort((Apple apple1, Apple apple2) -> apple1.getWeight().compareTo(apple2.getWeight()));
        inventory.sort(Comparator.comparing(Apple::getWeight).reversed());
        numbers.sort((Integer i1, Integer i2) -> i1.compareTo(i2));

        abc((Runnable r) -> System.out.println("hhhhhh"));

        Supplier<Apple> c = Apple::new;
        Apple apple = c.get();
    }


    public static <T> List<T> filterApples(List<T> inventory, Predicate<T> p) {
        List<T> list = new ArrayList<>();
        for (T e : inventory) {
            if (p.test(e)) {
                list.add(e);
            }
        }
        return list;
    }

    public static void abc(Consumer<Runnable> c) {
        System.out.println("slkafjdlasjf");
    }

}
