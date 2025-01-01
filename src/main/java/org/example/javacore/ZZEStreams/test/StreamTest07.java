package org.example.javacore.ZZEStreams.test;

import org.example.javacore.ZZEStreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;


//1 . Order LightLovel by title
//2. Retrieve the first 3 light novels title with price less than 4
public class StreamTest07 {


    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6);
         integers.stream().reduce((x, y) -> x + y).ifPresent(System.out::println);

        Integer intReduce = integers.stream().reduce(0, (x, y) -> x + y);
        System.out.println(intReduce);

        integers.stream().reduce(Integer::sum).ifPresent(System.out::println);

        System.out.println(integers.stream().reduce(0, Integer::sum));;

        System.out.println("-------- MULTIPLICACAO ---------");
        integers.stream()
                .reduce((x, y) -> x * y)
                .ifPresent(System.out::println);

        System.out.println("COM IDENTITY MULT");
        System.out.println(integers.stream().reduce(1, (x, y) -> x * y));


        System.out.println("---------- ENCONTRANDO O MAX ----------");
        integers.stream()
                .reduce((x, y) -> x > y ? x : y)
                .ifPresent(System.out::println);

        integers.stream()
                .reduce(Integer::max)
                .ifPresent(System.out::println);
    }
}
