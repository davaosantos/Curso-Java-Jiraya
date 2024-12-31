package org.example.javacore.ZZEStreams.test;

import org.example.javacore.ZZEStreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamTest06 {

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
        System.out.println("Any Match");
        System.out.println(lightNovels.stream().anyMatch(l -> l.getPrice() > 8));
        System.out.println(lightNovels.stream().anyMatch(l -> l.getPrice() > 9));
        System.out.println("-------- ALL MATCH --------");
        System.out.println(lightNovels.stream().allMatch(l -> l.getPrice() > 0));
        System.out.println("-------- NONE MATCH ------");
        System.out.println(lightNovels.stream().noneMatch(l -> l.getPrice() > 0));

        System.out.println("--------- Any match -----------");
        lightNovels.stream()
                .filter(l -> l.getPrice() > 3)
                .findAny()
                .ifPresent(System.out::println);

        System.out.println("--------- FIND FIRST ----------");
        lightNovels.stream()
                .filter(l -> l.getPrice() > 3).max(Comparator.comparing(LightNovel::getPrice))
                .ifPresent(System.out::println);

    }
}
