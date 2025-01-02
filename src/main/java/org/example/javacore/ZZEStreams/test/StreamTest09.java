package org.example.javacore.ZZEStreams.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest09 {

    public static void main(String[] args) {

//        testesIntStream();
        lerTxtComStream();

    }

    private static void testesIntStream() {
        System.out.println("---------- RANGE -----------");
        IntStream.range(1, 50)
                .filter(n -> n % 2 == 0)
                .forEach(num -> {
                    System.out.print(num + " ");
                });

        System.out.println();

        System.out.println("--------RANGE CLOSED--------");

        IntStream.rangeClosed(1, 50)
                .filter(n -> n % 2 == 0)
                .forEach(num -> {
                    System.out.print(num + " ");
                });

        System.out.println();
        System.out.println("-------- STREAM DE STRINGS ----------");

        Stream<String> streamStr = Stream.of("David", "Teste", "Dois");

        Stream.of("David", "Teste", "Dois")
                .map(String::toUpperCase)
                .forEach(s -> {
                    System.out.print(s + " ");
                });

        int num[] = {1, 2, 3,4,5};
        IntStream stream = Arrays.stream(num);

        System.out.println();

        Arrays.stream(num)
                .average()
                .ifPresent(System.out::println);
    }

    private static void lerTxtComStream(){
        try(Stream<String> lines = Files.lines(Paths.get("file.txt"))){

//            System.out.println("------- MOSTRANDO TODOS --------");
//            lines.forEach(System.out::println);

            System.out.println("-------- FILTRANDO JAVA ---------");
            lines.filter(l -> l.toUpperCase().contains("JAVA"))
                    .forEach(System.out::println);
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
