package com.java8.新的日期和时间API;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;

import static java.time.temporal.TemporalAdjusters.*;

/**
 * @Author MASTERYEE
 * @Date 2018/10/26 21:23
 **/
public class LocalDateTimeDemo {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        System.out.println(now.toString());
        System.out.println(now.toLocalDate());
        System.out.println(now.toLocalTime());
        LocalDate date = LocalDate.now();
        LocalDate date1 = date.plusDays(1);
        System.out.println(date1);
        System.out.println(date.plusMonths(1));
        date.minusMonths(1);
        LocalDate date2 = date.withDayOfMonth(2);
        System.out.println(date2);

        System.out.println(date.plusWeeks(1));
        System.out.println(date.minusDays(1));
        LocalDate with = date.with(firstDayOfMonth());
        System.out.println(with);
        System.out.println(date.with(lastDayOfMonth()));
        System.out.println(date.with(lastDayOfYear()));
        System.out.println(date.with(lastInMonth(DayOfWeek.of(1))));
        System.out.println("===========");
        System.out.println(date.with(dayOfWeekInMonth(3, DayOfWeek.of(2))));
        System.out.println(date.with(next(DayOfWeek.of(1))));
        System.out.println(date.with(nextOrSame(DayOfWeek.of(2))));
    }
}
