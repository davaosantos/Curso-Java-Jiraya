package org.example.javacore.URegex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    public static void main(String[] args) {
        String regex = "ab";
        String text = "abaaba";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        System.out.println("texto:   " + text);
        System.out.println("Indice : 12345789");
        System.out.println("Regex " + regex);
        System.out.println("Posições encontradas");

        while (matcher.find()){
            System.out.println(matcher.start() + " ");
        }

    }
}
