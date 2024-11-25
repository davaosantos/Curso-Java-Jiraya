package org.example.javacore.YColecoes.test;

import org.example.javacore.YColecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);

        MangaByIdComparator mangaByIdComparator = new MangaByIdComparator();
        mangas.add(new Manga(1L, "Attack on titan", 10.0));
        mangas.add(new Manga(4L,"Vinland Saga", 15.2));
        mangas.add(new Manga(3L, "Bersek", 13.0));
        mangas.add(new Manga(2L, "Death Note", 14.3));
        mangas.add(new Manga(6L, "Dragon Ball", 3.3));
        mangas.add(new Manga(5L, "CDZ", 4.5));
//        Collections.sort(mangas);

        mangas.sort(mangaByIdComparator);
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga mangaSearch = new Manga(6L, "Dragon Ball", 2.99);
        System.out.println(Collections.binarySearch(mangas, mangaSearch, mangaByIdComparator));

//        Arrays.b
    }
}
