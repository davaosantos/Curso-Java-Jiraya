package org.example.javacore.ZZEStreams.test;

import org.example.javacore.ZZEStreams.dominio.Category;
import org.example.javacore.ZZEStreams.dominio.LightNovel;
import org.example.javacore.ZZEStreams.dominio.Promotion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;
import static org.example.javacore.ZZEStreams.dominio.Promotion.NORMAL_PRICE;
import static org.example.javacore.ZZEStreams.dominio.Promotion.UNDER_PROMOTION;

public class StreamTest13 {

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
        Map<Promotion, List<LightNovel>> mapPorPromotion = lightNovels.stream()
                .collect(groupingBy(ln -> ln.getPrice() < 6 ? UNDER_PROMOTION : NORMAL_PRICE
                ));

        System.out.println(mapPorPromotion);

        //Map<Category, Map<Promotion, List<LightNovel>>>
        Map<Category, Map<Promotion, List<LightNovel>>> mapCategoryPromotion = lightNovels.stream()
                .collect(groupingBy(LightNovel::getCategory, groupingBy(ln -> ln.getPrice() < 6 ? UNDER_PROMOTION : NORMAL_PRICE
                )));

        System.out.println(mapCategoryPromotion);
    }
}
