package org.example.javacore.ZZEStreams.test;

import org.example.javacore.ZZEStreams.dominio.Category;
import org.example.javacore.ZZEStreams.dominio.LightNovel;
import org.example.javacore.ZZEStreams.dominio.Promotion;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;
import static org.example.javacore.ZZEStreams.dominio.Promotion.NORMAL_PRICE;
import static org.example.javacore.ZZEStreams.dominio.Promotion.UNDER_PROMOTION;

public class StreamTest14 {

    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Overlord", 3.99, Category.FANTASY),
            new LightNovel("Tensei shittara", 8.99, Category.FANTASY),
            new LightNovel("Violet Evergarden", 5.99, Category.DRAMA),
            new LightNovel("No game no life", 2.99, Category.FANTASY),
            new LightNovel("Fullmetal Alchemist", 5.99, Category.FANTASY),
            new LightNovel("Kumo desuga", 1.99, Category.FANTASY),
            new LightNovel("Kumo desuga", 1.99, Category.FANTASY),
            new LightNovel("Monogatari", 4, Category.ROMANCE)
    ));

    public static void main(String[] args) {

        Map<Category, Long> collect = lightNovels
                .stream()
                .collect(groupingBy(LightNovel::getCategory, Collectors.counting()));

        System.out.println(collect);

        System.out.println("Agora por Categoria e preço, devolvendo o Optional");
        Map<Category, Optional<LightNovel>> collect1 = lightNovels.stream()
                .collect(
                        groupingBy(LightNovel::getCategory,
                                Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))));

        System.out.println(collect1);

        System.out.println("---------Removendo o Optional ----------");

        Map<Category, LightNovel> collect2 = lightNovels.stream()
                .collect(groupingBy(LightNovel::getCategory,
                        Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice)), Optional::get)));

        System.out.println(collect2);

        Map<Category, LightNovel> collect3 = lightNovels.stream()
                .collect(Collectors.toMap(LightNovel::getCategory, Function.identity(), BinaryOperator.maxBy(Comparator.comparing(LightNovel::getPrice))));
    }
}
