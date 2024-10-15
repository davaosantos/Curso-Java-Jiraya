package org.example.javacore.Rdates.test;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class ZoneTest01 {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault());
        ZoneId zonePuertoRico = ZoneId.of("America/Puerto_Rico");
        System.out.println(zonePuertoRico);


        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        ZonedDateTime zonedDateTime = ldt.atZone(zonePuertoRico);
        System.out.println(zonedDateTime);

        Instant instant = Instant.now();
        System.out.println(instant);
        ZonedDateTime zonedDateTime1 = instant.atZone(zonePuertoRico);

        System.out.println(zonedDateTime1);

        System.out.println(ZoneOffset.MAX);
        System.out.println(ZoneOffset.MIN);

        ZoneOffset zoneOffsetManaus = ZoneOffset.of("-04:00");
        OffsetDateTime offsetDateTime = ldt.atOffset(zoneOffsetManaus);
        System.out.println(offsetDateTime);
        OffsetDateTime offsetDateTime1 = OffsetDateTime.of(ldt, zoneOffsetManaus);
        System.out.println(offsetDateTime1);

        OffsetDateTime offsetDateTime2 = instant.atOffset(zoneOffsetManaus);
        System.out.println(offsetDateTime2);

        JapaneseDate japaneseDate = JapaneseDate.from(LocalDateTime.now());
        System.out.println(japaneseDate);
    }
}
