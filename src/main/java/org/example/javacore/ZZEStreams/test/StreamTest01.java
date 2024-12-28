package org.example.javacore.ZZEStreams.test;

import org.example.javacore.ZZEStreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


//1 . Order LightLovel by title
//2. Retrieve the first 3 light novels title with price less than 4
public class StreamTest01 {

    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei shittara", 8.99),
            new LightNovel("Overlord", 3.99),
            new LightNovel("Violet Evergarden", 5.99),
            new LightNovel("No game no life", 2.99),
            new LightNovel("Fullmetal Alchemist", 5.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Monogatari", 4)

    ));

    public static void main(String[] args) {

        if (!lightNovels.isEmpty()){
//            lightNovels.sort((l1, l2) -> l1.getTitle().compareTo(l2.getTitle()));
            lightNovels.sort(Comparator.comparing(LightNovel::getTitle));
            System.out.println("Ordenação por titulo");
            System.out.println(lightNovels);

            System.out.println("----- ORDENAÇÃO POR PREÇO -----");

            int qtdEncontrada = 0;
            List<String> lightNovelsFiltrados = new ArrayList<>();
            for (LightNovel lightNovel : lightNovels) {
                if (qtdEncontrada <= 3 && lightNovel.getPrice() <= 4){
                    lightNovelsFiltrados.add(lightNovel.getTitle());
                    qtdEncontrada++;
                }
            }

            System.out.println(lightNovelsFiltrados);


        }



    }
}
