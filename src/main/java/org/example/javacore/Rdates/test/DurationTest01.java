package org.example.javacore.Rdates.test;

import java.time.*;

public class DurationTest01 {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfterTwoYears = LocalDateTime.now().plusYears(2);
        LocalTime timeNow = LocalTime.now();
        LocalTime timeMinus7Hours = LocalTime.now().minusHours(7);

        Duration d1 = Duration.between(now, nowAfterTwoYears);
        Duration d2 = Duration.between(timeNow, timeMinus7Hours);
        Duration d3 = Duration.between(Instant.now(), Instant.now().plusSeconds(1000));
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);

        Duration d4 = Duration.ofDays(20);
        Duration d5 = Duration.ofMinutes(20);

        System.out.println(d4);
        System.out.println(d5);

        Duration.between(LocalDate.now(), LocalDate.now().plusYears(2));

    }
}
