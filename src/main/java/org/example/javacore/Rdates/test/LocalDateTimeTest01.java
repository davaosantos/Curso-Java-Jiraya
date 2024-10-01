package org.example.javacore.Rdates.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();

        LocalDate ld = LocalDate.of(2024, Month.AUGUST, 6);
        LocalTime lt = LocalTime.of(9, 45, 21);

        LocalDate ldStr = LocalDate.parse("2024-08-06");

        LocalTime ltStr = LocalTime.parse("09:45:21");

        LocalDateTime ltd1 = ld.atTime(lt);
        LocalDateTime ltd2 = lt.atDate(ld);

        System.out.println(ld);
        System.out.println(lt);

        System.out.println(ldStr);
        System.out.println(ltStr);

        System.out.println(ltd1);
        System.out.println(ltd2);


    }
}
