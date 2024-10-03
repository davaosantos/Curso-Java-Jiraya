package org.example.javacore.Rdates.test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

public class PeriodTest01 {
    public static void main(String[] args) {

        LocalDate date2Anos = LocalDate.now().plusYears(2).plusDays(7);
        LocalDate dateNow = LocalDate.now();


        Period p1 = Period.between(dateNow , date2Anos);
        Period p2 = Period.ofDays(10);
        Period p3 = Period.ofWeeks(58);
        Period p4 = Period.ofMonths(3);
        Period p5 = Period.ofYears(3);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
        System.out.println(p3.getMonths());
    }
}
