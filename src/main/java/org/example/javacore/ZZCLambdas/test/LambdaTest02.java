package org.example.javacore.ZZCLambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaTest02 {
    public static void main(String[] args) {

        List<String> strings = List.of("Naruto", "Nanatsu", "Dragonball");
        List<Integer> sizeString = map(strings, String::length);
        List<String> strUppercase = map(strings, String::toUpperCase);
        System.out.println(sizeString);
        System.out.println(strUppercase);

    }

    private static <T, R> List<R> map(List<T> tlist, Function<T,R> function){
        List<R> result = new ArrayList<>();

        for (T e : tlist) {
            R r = function.apply(e);
            result.add(r);
        }

        return result;
    }
}
