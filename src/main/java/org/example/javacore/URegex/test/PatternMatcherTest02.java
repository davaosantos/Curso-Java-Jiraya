package org.example.javacore.URegex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {

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
        String regexQueNaoEBranco = "\\S";
        String textDigitos = "@awd223a wdaw4 56";
        Pattern pattern = Pattern.compile(regexQueNaoEBranco);
        Matcher matcher = pattern.matcher(textDigitos);
        System.out.println("texto:   " + textDigitos);
        System.out.println("Indice : 12345789");
        System.out.println("Regex " + regexQueNaoEBranco);
        System.out.println("Posições encontradas");

        while (matcher.find()){
            System.out.println(matcher.start() + " " + matcher.group());
        }

    }
}
