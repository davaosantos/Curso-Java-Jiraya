package org.example.javacore.SFormatacao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatter01 {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        String format = localDate.format(DateTimeFormatter.ISO_DATE);
        String format2 = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);
        String format3 = localDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(format);
        System.out.println(format2);
        System.out.println(format3);

        LocalDate parse1 = LocalDate.parse("2024-10-14", DateTimeFormatter.ISO_DATE);
        LocalDate parse2 = LocalDate.parse("20241014", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate parse3 = LocalDate.parse("2024-10-14", DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(parse1);
        System.out.println(parse2);
        System.out.println(parse3);

        LocalDateTime now = LocalDateTime.now();
        String s4 = now.format(DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(s4);

        LocalDateTime localDateTime = LocalDateTime.parse("20241014", DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(localDateTime);

    }
}
