package com.java8.第二章行为参数化;

/**
 * @Author MASTERYEE
 * @Date 2018/10/15 20:56
 **/
public class AppleHeavyWeightPredicate implements ApplePredicate {
    @Override
    public Boolean test(Apple apple) {
        return apple.getWeight() > 150;
    }
}
