package org.example.javacore.SFormatacao;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest01 {

    public static void main(String[] args) {
        Locale localeBR = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;
//        Locale[] localeArr = Locale.getAvailableLocales();

//        for (Locale locale : localeArr) {
//            System.out.print(locale.getDisplayLanguage());
//            System.out.println();
//            System.out.print(locale.getDisplayCountry());
//        }


        NumberFormat[] nfa = new NumberFormat[4];

        nfa[0] = NumberFormat.getInstance();
        nfa[1] = NumberFormat.getInstance(localeBR);
        nfa[2] = NumberFormat.getInstance(localeIT);
        nfa[3] = NumberFormat.getInstance(localeJP);

        Double valor = 10_000.2130;

        for (NumberFormat numberFormat : nfa) {
            System.out.println(numberFormat.format(valor));
        }


    }
}
