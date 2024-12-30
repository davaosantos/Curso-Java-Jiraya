package org.example.javacore.ZZEStreams.test;

import org.example.javacore.ZZEStreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

//1 . Order LightLovel by title
//2. Retrieve the first 3 light novels title with price less than 4
public class StreamTest04 {


    public static void main(String[] args) {
        List<List<String>> devDojo = new ArrayList<>();
        List<String> graphicDesigners = List.of("Wildnei Suane", "Eriks Oliveira", "Sandy Design");
        List<String> developers = List.of("William", "David", "Harrison");
        List<String> students = List.of("Fernanda", "Maria studante", "Redpool");

        devDojo.add(graphicDesigners);
        devDojo.add(developers);
        devDojo.add(students);

        for (List<String> people : devDojo) {
            for (String person : people) {
                System.out.println(person);
            }
        }

        System.out.println("-------------");

//        Stream<String> stringStream = devDojo.stream()
//                .flatMap(l -> l.stream());

        devDojo.stream()
                .flatMap(Collection::stream)
                .forEach(System.out::println);


    }
}