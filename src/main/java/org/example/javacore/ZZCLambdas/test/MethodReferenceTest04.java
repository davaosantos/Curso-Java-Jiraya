package org.example.javacore.ZZCLambdas.test;


import org.example.javacore.ZZCLambdas.dominio.Anime;
import org.example.javacore.ZZCLambdas.dominio.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

//Reference to a constructor
public class MethodReferenceTest04 {

    public static void main(String[] args) {
//        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Naruto", 43), new Anime("Bersek", 33),
                new Anime("Nanatsu", 10), new Anime("One Piece", 300)));

//        Supplier<AnimeComparators> animeComparatorsSupplier = () -> new AnimeComparators();
        Supplier<AnimeComparators> animeComparatorsSupplier = AnimeComparators::new;
        AnimeComparators animeComparators = animeComparatorsSupplier.get();
        animeList.sort(animeComparators::compareByEpisodesNonStatic);
        System.out.println(animeList);

//        Supplier<Anime> animeSupplier = Anime::new;

        BiFunction<String, Integer, Anime> animeBiFunction = (title , episodes) -> new Anime(title, episodes);

        BiFunction<String, Integer, Anime> animeBiFunctio2 = Anime::new;
        System.out.println(animeBiFunctio2.apply("Super Campeoes", 36));

    }
}
