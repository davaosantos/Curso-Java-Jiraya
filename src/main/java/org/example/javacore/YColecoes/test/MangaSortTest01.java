package org.example.javacore.YColecoes.test;

import org.example.javacore.YColecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaByIdComparator implements Comparator<Manga> {
    @Override
    public int compare(Manga m1, Manga m2) {
        return m1.getId().compareTo(m2.getId());
    }
}

public class MangaSortTest01 {

    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(1L, "Attack on titan", 10.0));
        mangas.add(new Manga(4L,"Vinland Saga", 15.2));
        mangas.add(new Manga(3L, "Bersek", 13.0));
        mangas.add(new Manga(2L, "Death Note", 14.3));
        mangas.add(new Manga(6L, "Dragon Ball", 3.3));
        mangas.add(new Manga(5L, "CDZ", 4.5));

        System.out.println(mangas);

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Collections.sort(mangas);

        System.out.println("--------------");

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        //Ordenando por ID com o comparator
//        Collections.sort(mangas, new MangaByIdComparator());
        mangas.sort(new MangaByIdComparator());
        System.out.println("-------------- COM COMPARATOR ---------");

        for (Manga manga : mangas) {
            System.out.println(manga);
        }


    }
}