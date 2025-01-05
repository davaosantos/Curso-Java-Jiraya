package org.example.javacore.ZZEStreams.test;

import org.example.javacore.ZZEStreams.dominio.Category;
import org.example.javacore.ZZEStreams.dominio.LightNovel;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTest12 {

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

        Map<Category, List<LightNovel>> categoryLightNovelMap = new HashMap<>();
        List<LightNovel> fantasy = new ArrayList<>();
        List<LightNovel> drama = new ArrayList<>();
        List<LightNovel> romance = new ArrayList<>();

        for (LightNovel lightNovel : lightNovels) {
            switch (lightNovel.getCategory()) {
                case FANTASY:
                    fantasy.add(lightNovel);
                    break;
                case DRAMA:
                    drama.add(lightNovel);
                    break;
                case ROMANCE:
                    romance.add(lightNovel);
                    break;
                default:
                    break;
            }
        }
        categoryLightNovelMap.put(Category.FANTASY, fantasy);
        categoryLightNovelMap.put(Category.ROMANCE, romance);
        categoryLightNovelMap.put(Category.DRAMA, drama);

        System.out.println(categoryLightNovelMap);

        System.out.println(" --------- COM STREAMS --------- ");
        Map<Category, List<LightNovel>> novelsMapStream = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory));
        System.out.println(novelsMapStream);
    }
}
