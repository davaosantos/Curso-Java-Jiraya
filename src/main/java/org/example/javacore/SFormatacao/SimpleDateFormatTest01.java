package org.example.javacore.SFormatacao;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {

    public static void main(String[] args) {
//        String mascara = "'Amsterda' yyyy.MM.dd G 'at' HH:mm:ss z";
        String mascaraPersonalizada = "'Amsterda' dd ' de ' MMMM 'de' yyyy ";
        SimpleDateFormat sdf = new SimpleDateFormat(mascaraPersonalizada);
        System.out.println(sdf.format(new Date()));

    }
}
