package org.example.javacore.YColecoes.test;

import org.example.javacore.YColecoes.dominio.Manga;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest01 {

    public static void main(String[] args) {

//        Set<Manga> mangas = new HashSet<>();
        Set<Manga> mangas = new LinkedHashSet<>();

        mangas.add(new Manga(1L, "Attack on titan", 10.0, 0));
        mangas.add(new Manga(4L,"Vinland Saga", 15.2,  2));
        mangas.add(new Manga(3L, "Bersek", 13.0, 4));
        mangas.add(new Manga(2L, "Death Note", 14.3, 3));
        mangas.add(new Manga(6L, "Dragon Ball", 3.3, 1));
        mangas.add(new Manga(5L, "CDZ", 4.5, 0));
        mangas.add(new Manga(5L, "CDZ", 4.5, 0));

        for (Manga manga : mangas){
            System.out.println(manga);
        }
    }
}
