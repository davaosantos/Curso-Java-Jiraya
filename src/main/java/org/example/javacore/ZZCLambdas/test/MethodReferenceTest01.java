package org.example.javacore.ZZCLambdas.test;

import org.example.javacore.ZZCLambdas.dominio.Anime;
import org.example.javacore.ZZCLambdas.dominio.service.AnimeComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodReferenceTest01 {

    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Naruto", 43), new Anime("Bersek", 33),
                new Anime("Nanatsu", 10), new Anime("One Piece", 300)));

//        Collections.sort(animeList, (a1, a2) -> a1.getTitle().compareTo(a2.getTitle()));

        animeList.sort(AnimeComparators::compareByTitle);
        System.out.println(animeList);

        System.out.println("----------");
        System.out.println("Ordenando por episodios : ");
        animeList.sort(AnimeComparators::compareByEpisodes);
        System.out.println(animeList);
    }
}
