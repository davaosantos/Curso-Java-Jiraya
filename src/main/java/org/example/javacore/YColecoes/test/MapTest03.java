package org.example.javacore.YColecoes.test;

import org.example.javacore.YColecoes.dominio.Consumidor;
import org.example.javacore.YColecoes.dominio.Manga;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Consumidor c1 = new Consumidor("Celso Russomano");
        Consumidor c2 = new Consumidor("David Alisson");
        System.out.println(c1);

        Manga m1 = new Manga(1L, "Attack on titan", 10.0);
        Manga m2 = new Manga(4L, "Vinland Saga", 15.2);
        Manga m3 = new Manga(3L, "Bersek", 13.0);
        Manga m4 = new Manga(2L, "Death Note", 14.3);
        Manga m5 = new Manga(6L, "Dragon Ball", 3.3);
        Manga m6 = new Manga(5L, "CDZ", 4.5);

        List<Manga> cons1mangaList = List.of(m1, m2, m3);
        List<Manga> cons2mangaList = List.of(m4, m5, m6);
        Map<Consumidor, List<Manga>> consumidorMangaMap = new HashMap<>();
        consumidorMangaMap.put(c1, cons1mangaList);
        consumidorMangaMap.put(c2, cons2mangaList);

        for (Map.Entry<Consumidor, List<Manga>> consumidorListEntry : consumidorMangaMap.entrySet()){
            System.out.println("---" + consumidorListEntry.getKey().getNome());
            for (Manga manga : consumidorListEntry.getValue()){
                System.out.println("----------" + manga.getNome());
            }
//            System.out.println(consumidorListEntry.getValue());
        }

    }
}
