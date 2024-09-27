package org.example.javacore.Rdates.test;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTest01 {

    public static void main(String[] args) {
        LocalTime time = LocalTime.of(23, 32, 12);
        LocalTime localTimeNow = LocalTime.now();
        System.out.println(time);
        System.out.println(localTimeNow);
        System.out.println(time.getMinute());
        System.out.println(time.getHour());
        System.out.println(time.get(ChronoField.HOUR_OF_DAY));
        System.out.println(time.MIN);
        System.out.println(time.MAX);
    }
}
