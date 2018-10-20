package com.java8.第二章行为参数化;

/**
 * @Author MASTERYEE
 * @Date 2018/10/15 20:52
 **/
public class Apple {

    private Integer weight;
    private String color;

    public Apple() {
    }

    public Apple(Integer weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
