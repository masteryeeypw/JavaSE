package com.java8.使用流;

/**
 * @Author MASTERYEE
 * @Date 2018/10/20 20:17
 **/
public class Apple {

    private String name;
    private Integer weight;
    private Integer type;

    @Override
    public String toString() {
        return "Apple{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", type=" + type +
                '}';
    }

    public Apple(String name, Integer weight, Integer type) {
        this.name = name;
        this.weight = weight;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}
