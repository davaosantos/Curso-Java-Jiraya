package org.example.javacore.Rdates.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {

    public static void main(String[] args) {

        //pt-BR
        Locale localeItaly = new Locale("it", "IT");
        Locale localeSuica = new Locale("it", "CH");
        Locale localeIndia = new Locale("ih", "IN");
        Locale localeJapao = new Locale("ja", "JP");
        Locale localeHolanda = new Locale("nl", "NL");

        Calendar calendar = Calendar.getInstance();

        DateFormat dtInstanceItalia = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat dtInstanceSuica = DateFormat.getDateInstance(DateFormat.FULL, localeSuica);
        DateFormat dtInstanceIndia = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
        DateFormat dtInstanceJapao = DateFormat.getDateInstance(DateFormat.FULL, localeJapao);
        DateFormat dtInstanceHolanda = DateFormat.getDateInstance(DateFormat.FULL, localeHolanda);

        System.out.println("Italia " + dtInstanceItalia.format(calendar.getTime()));
        System.out.println("Suiça " + dtInstanceSuica.format(calendar.getTime()));
        System.out.println("India " + dtInstanceIndia.format(calendar.getTime()));
        System.out.println("Japao " + dtInstanceJapao.format(calendar.getTime()));
        System.out.println("Holanda " + dtInstanceHolanda.format(calendar.getTime()));

        System.out.println(localeItaly.getDisplayCountry());
        System.out.println(localeSuica.getDisplayCountry());
        System.out.println(localeItaly.getDisplayLanguage());


    }
}
