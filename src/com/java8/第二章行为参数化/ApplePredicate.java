package com.java8.第二章行为参数化;


/**
 * @Author MASTERYEE
 * @Date 2018/10/15 20:52
 **/
public interface ApplePredicate {

    default Boolean test(Apple apple) {
        return true;
    }

}
