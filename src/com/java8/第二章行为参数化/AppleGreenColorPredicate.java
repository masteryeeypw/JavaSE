package com.java8.第二章行为参数化;

/**
 * @Author MASTERYEE
 * @Date 2018/10/15 20:57
 **/
public class AppleGreenColorPredicate implements ApplePredicate {
    @Override
    public Boolean test(Apple apple) {
        return "greed".equals(apple.getWeight());
    }
}
