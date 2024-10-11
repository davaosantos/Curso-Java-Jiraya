package org.example.javacore.Rdates.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.*;

class obterProximoDiaUtil implements TemporalAdjuster{
    @Override
    public Temporal adjustInto(Temporal temporal) {
        DayOfWeek dayOfWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
        int days;

        switch (dayOfWeek){
            case FRIDAY:
                days = 3;
                break;
            case SATURDAY:
                days = 2;
                break;
            default:
                days = 1;
                break;
        }

        return temporal.plus(days, ChronoUnit.DAYS);
    }
}

public class TemporalAdjusterTest01 {

    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().withDayOfMonth(11).with(new obterProximoDiaUtil());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

    }
}
