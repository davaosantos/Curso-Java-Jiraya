package org.example.javacore.Rdates.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTest01 {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        now = now.with(ChronoField.DAY_OF_MONTH, 20);
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = now.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = now.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = now.with(TemporalAdjusters.previous(DayOfWeek.FRIDAY));
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = now.with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = now.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = now.with(TemporalAdjusters.firstDayOfNextMonth());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = now.with(TemporalAdjusters.firstDayOfNextYear());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
    }
}
