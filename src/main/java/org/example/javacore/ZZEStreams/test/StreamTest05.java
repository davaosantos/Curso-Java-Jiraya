package org.example.javacore.ZZEStreams.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//1 . Order LightLovel by title
//2. Retrieve the first 3 light novels title with price less than 4
public class StreamTest05 {


    public static void main(String[] args) {
        List<String> words = List.of("Gomu", "Gomu", "No", "Mi");
        String[] letters = words.get(0).split("");

        System.out.println(Arrays.toString(letters));


        List<String[]> letras = words.stream()
                .map(w -> w.split(""))
                .collect(Collectors.toList());

        Stream<String> stream = Arrays.stream(letters);


//        List<String> words = List.of("Gomu", "Gomu", "No", "Mi");
        List<String> lettersFlat = words.stream()
                .map(w -> w.split("")) // Stream<String[]//
                .flatMap(Arrays::stream) // Stream<String>
                .collect(Collectors.toList());

        System.out.println("------- COM FLATMAP ----");
        System.out.println(lettersFlat);


    }
}