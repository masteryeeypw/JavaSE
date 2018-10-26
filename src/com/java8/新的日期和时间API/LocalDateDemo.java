package com.java8.新的日期和时间API;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;

/**
 * @Author MASTERYEE
 * @Date 2018/10/26 20:55
 **/
public class LocalDateDemo {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        int dayOfMonth = now.getDayOfMonth();
        System.out.println(dayOfMonth);
        int year = now.getYear();
        System.out.println(year);
        Month month = now.getMonth();
        System.out.println(month);
        System.out.println(month.getValue());
        DayOfWeek dayOfWeek = now.getDayOfWeek();
        System.out.println(dayOfWeek.getValue());
        System.out.println(dayOfWeek);
        int dayOfYear = now.getDayOfYear();
        System.out.println(dayOfYear);
        int monthValue = now.getMonthValue();
        System.out.println(monthValue);
        int i = now.lengthOfMonth();
        System.out.println(i);
        int i1 = now.lengthOfYear();
        System.out.println(i1);
        boolean leapYear = now.isLeapYear();
        System.out.println(leapYear);
        System.out.println(now);
        int i2 = now.get(ChronoField.DAY_OF_WEEK);
        now.getDayOfWeek().getValue();
        System.out.println(i2);
    }

}
