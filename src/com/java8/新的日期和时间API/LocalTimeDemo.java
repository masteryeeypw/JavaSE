package com.java8.新的日期和时间API;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * @Author MASTERYEE
 * @Date 2018/10/26 21:06
 **/
public class LocalTimeDemo {

    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        System.out.println(now);
        System.out.println(now.getHour());
        System.out.println(now.getMinute());
        System.out.println(now.getSecond());
        System.out.println(now.getNano());
        LocalDate parse = LocalDate.parse("2018-01-10");
        LocalDate parse1 = LocalDate.parse("2018-1-4", DateTimeFormatter.ofPattern("yyyy-M-d"));
        LocalTime parse2 = LocalTime.parse("12:1:1", DateTimeFormatter.ofPattern("HH:m:s"));
        System.out.println(parse2);
        System.out.println(parse1);
        System.out.println(parse);

    }
}
