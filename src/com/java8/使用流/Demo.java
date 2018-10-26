package com.java8.使用流;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * @Author MASTERYEE
 * @Date 2018/10/20 20:19
 **/
public class Demo {

    public static void main(String[] args) {
        List<Apple> apples = new Demo().getApples();
        List<Apple> collect = apples.stream().distinct().collect(toList());
        List<String> collect1 = apples.stream().map(Apple::getName).distinct().collect(toList());
        List<Apple> collect2 = apples.stream().skip(3).collect(toList());
        //System.out.println(collect2.toString());

        List<String> strings = Arrays.asList("Java8", "lisa", "lenth", "action");
        List<String[]> collect3 = strings.stream().map(s -> s.split("")).distinct().collect(toList());
        List<Stream<String>> collect4 = strings.stream().map(s -> s.split("")).map(Arrays::stream).distinct().collect(toList());
        List<String> collect5 = strings.stream().map(s -> s.split("")).flatMap(Arrays::stream).distinct().collect(toList());

        List<Integer> integers = Arrays.asList(1, 2, 3);
        List<Integer> integers2 = Arrays.asList(3, 4);
        List<int[]> collect6 = integers.stream().flatMap(integer -> integers2.stream().map(j -> new int[]{integer, j})).collect(toList());
        List<int[]> collect7 = integers.stream().flatMap(
                integer -> integers2.stream().filter(j -> j * integer % 3 == 0).map(j -> new int[]{integer, j})
        ).collect(toList());

        //collect7.stream().forEach(a -> System.out.println(Arrays.toString(a)));

        boolean b = apples.stream().anyMatch(apple -> apple.getName().equalsIgnoreCase("红苹果"));
        boolean b1 = apples.stream().allMatch(apple -> apple.getName().equalsIgnoreCase("红苹果"));
        boolean b2 = apples.stream().noneMatch(apple -> apple.getName().equalsIgnoreCase("红苹果"));

        Optional<Apple> optionalApple = apples.stream().filter(apple -> apple.getName().equalsIgnoreCase("红1苹果")).findAny();
//        Apple apple = optionalApple.get();
        boolean present = optionalApple.isPresent();
//        System.out.println(apple);
        System.out.println(present);
        Integer integer = apples.stream().map(Apple::getWeight).reduce(Integer::max).get();
        Integer reduce = apples.stream().map(Apple::getWeight).reduce(0, Integer::sum);
        long count = apples.stream().count();
        System.out.println(count);
        System.out.println(integer);
        System.out.println(reduce);
//        System.out.println(b2);

        //System.out.println(collect5.toString());
        //List<Integer> collect3 = strings.stream().map(String::length).collect(toList());
       // System.out.println(collect3.toString());
        //apples.stream().forEach(System.out::println);
//        apples.stream().forEach((Apple a) -> System.out.println(a));
        //List<Apple> collect2 = apples.stream().limit(3).collect(toList());
        //apples.stream().filter(apple -> apple.getType() == 2).collect(toList());
        //System.out.println(collect2);
        //apples.stream().map(Apple::getName).forEach(System.out::println);
//        System.out.println(collect1.toString());
//        System.out.println(Arrays.toString(collect.toArray()));
//        System.out.println(collect.toString());
    }

    public List<Apple> getApples() {
        return Arrays.asList(new Apple("红苹果", 100, 1),
                new Apple("青苹果", 40, 2),
                new Apple("红苹果", 89, 1),
                new Apple("红苹果", 59, 2),
                new Apple("青苹果", 50, 3),
                new Apple("粉苹果", 150, 3),
                new Apple("粉苹果", 20, 2));
    }

}
