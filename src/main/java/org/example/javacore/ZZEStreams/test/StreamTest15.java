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

public class StreamTest15 {

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
        Map<Category, DoubleSummaryStatistics> collect = lightNovels.stream()
                .collect(groupingBy(LightNovel::getCategory, Collectors.summarizingDouble(LightNovel::getPrice)));

        System.out.println(collect);

        System.out.println("----COM O PROMOTION---------");
        Map<Category, Map<Promotion, List<LightNovel>>> collect1 = lightNovels.stream().collect(groupingBy(LightNovel::getCategory,
                groupingBy(StreamTest15::getPromotion)));


        System.out.println("---UTILIZANDO mapping com LIST ------");
        //Map<Category, List<Promotion>>
        Map<Category, List<Promotion>> collectList = lightNovels.stream()
                .collect(

                        groupingBy(LightNovel::getCategory, Collectors.mapping(StreamTest15::getPromotion, Collectors.toList())
                ));

        System.out.println(collectList);

        System.out.println("-------MAPPING COM SET--------");
        Map<Category, Set<Promotion>> collectSet = lightNovels.stream()
                .collect(
                        groupingBy(LightNovel::getCategory, Collectors.mapping(StreamTest15::getPromotion, Collectors.toSet())
                        ));
        System.out.println(collectSet);

        System.out.println("--------COM O LINKED HASHSET-------");
        Map<Category, LinkedHashSet<Promotion>> collectHashSet = lightNovels.stream()
                .collect(
                        groupingBy(LightNovel::getCategory, Collectors.mapping(StreamTest15::getPromotion, Collectors.toCollection(LinkedHashSet::new)
                        )));

        System.out.println(collectHashSet);
    }


    private static Promotion getPromotion(LightNovel ln) {
        return ln.getPrice() < 6 ? UNDER_PROMOTION : NORMAL_PRICE;
    }
}
