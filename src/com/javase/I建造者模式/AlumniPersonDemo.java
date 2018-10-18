package com.javase.I建造者模式;

/**
 * Created by Yipw on 2018/10/18 0018.
 */
public class AlumniPersonDemo {

    public static void main(String[] args) {
        AlumniPerson alumniPerson = new AlumniPerson.Builder().setName("张三").build();
        System.out.println(alumniPerson.toString());
    }
}
