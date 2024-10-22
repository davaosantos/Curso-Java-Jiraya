package org.example.javacore.URegex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {

    // \d Todos os digitos
// \D Tudo que não for digito
// \s Espacos em branco \t \n \f \r
    // \S -> Todos os caracteres excluindo os brancos .
    public static void main(String[] args) {
//        String regex = "ab";
//        String text = "abaaba";
//        String regexDigit = "\\d";
//        String regexNaoDigito = "\\D";
//        String regexEspacos = "\\s";
        // \w -> a-Z A-Z , digitos , _
        // \W -> Tudo que não for incluso no \w
//        String regexQueNaoEBranco = "\\S";
        //[]
        //[a-zA-C]
//        String regexRange = "[abcABC]";
        String regexRange = "0[xX][0-9a-fA-F]";
        String textoHexa = "12 0x 0X 0xFFABC 0x109 0x1";
        Pattern pattern = Pattern.compile(regexRange);
        Matcher matcher = pattern.matcher(textoHexa);
        System.out.println("texto:   " + textoHexa);
        System.out.println("Indice : 12345789");
        System.out.println("Regex " + regexRange);
        System.out.println("Posições encontradas");

        while (matcher.find()){
            System.out.println(matcher.start() + " " + matcher.group());
        }

    }
}
