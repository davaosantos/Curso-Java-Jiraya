package org.example.javacore.ZZEStreams.test;

import org.example.javacore.ZZEStreams.dominio.LightNovel;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest11 {

    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Overlord", 3.99),
            new LightNovel("Tensei shittara", 8.99),
            new LightNovel("Violet Evergarden", 5.99),
            new LightNovel("No game no life", 2.99),
            new LightNovel("Fullmetal Alchemist", 5.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Monogatari", 4)

    ));

    public static void main(String[] args) {

        //Exemplo de Count com stream e com o Collect
        System.out.println(lightNovels.stream().count());
        System.out.println(
                lightNovels
                        .stream()
                        .collect(Collectors.counting())
        );

        //Exemplos de max
        lightNovels.stream()
                .max(Comparator.comparing(LightNovel::getPrice))
                .ifPresent(System.out::println);
        lightNovels.stream()
                .collect(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice)))
                .ifPresent(System.out::println);

        //Minimo
        lightNovels.stream()
                .collect(Collectors.minBy(Comparator.comparing(LightNovel::getPrice)))
                .ifPresent(System.out::println);


        //Soma
        //Com stream
        System.out.println(lightNovels
                .stream()
                .mapToDouble(LightNovel::getPrice)
                .sum());

        //Com Collectors
        System.out.println(lightNovels.stream().collect(Collectors.summingDouble(LightNovel::getPrice)));


        //Average
        lightNovels
                .stream()
                .mapToDouble(LightNovel::getPrice)
                .average()
                .ifPresent(System.out::println);


        System.out.println(lightNovels.stream().collect(Collectors.averagingDouble(LightNovel::getPrice)));

        DoubleSummaryStatistics dss = lightNovels.stream()
                .collect(Collectors.summarizingDouble(LightNovel::getPrice));

        System.out.println(dss);

        String titles = lightNovels.stream()
                .map(LightNovel::getTitle)
                .collect(Collectors.joining(", "));

        System.out.println(titles);
    }
}
