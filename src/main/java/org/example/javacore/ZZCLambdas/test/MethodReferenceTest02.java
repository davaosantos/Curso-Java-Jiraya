package org.example.javacore.ZZCLambdas.test;


import org.example.javacore.ZZCLambdas.dominio.Anime;
import org.example.javacore.ZZCLambdas.dominio.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

//Reference to an instance method of a particular Object
public class MethodReferenceTest02 {
    public static void main(String[] args) {
        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Naruto", 43), new Anime("Bersek", 33),
                new Anime("Nanatsu", 10), new Anime("One Piece", 300)));

        animeList.sort(animeComparators::compareByEpisodesNonStatic);
        animeList.sort((a1, a2) -> animeComparators.compareByEpisodesNonStatic(a1, a2));
        System.out.println(animeList);

    }
}
