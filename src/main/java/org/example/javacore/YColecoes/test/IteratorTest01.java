package org.example.javacore.YColecoes.test;

import org.example.javacore.YColecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(1L, "Attack on titan", 10.0, 0));
        mangas.add(new Manga(4L,"Vinland Saga", 15.2,  2));
        mangas.add(new Manga(3L, "Bersek", 13.0, 4));
        mangas.add(new Manga(2L, "Death Note", 14.3, 3));
        mangas.add(new Manga(6L, "Dragon Ball", 3.3, 1));
        mangas.add(new Manga(5L, "CDZ", 4.5, 0));

        System.out.println(mangas);

        //Aqui da ConcurrentModificationException
//        for (Manga manga : mangas) {
//            if (manga.getQuantidade() == 0){
//                mangas.remove(manga);
//            }
//        }

//        System.out.println("--------COM O ITERATOR -----------");
//        Iterator<Manga> mangaIterator = mangas.iterator();
//        while (mangaIterator.hasNext()){
//            if (mangaIterator.next().getQuantidade() == 0){
//                mangaIterator.remove();
//            }
//        }


        //Com o removeif
        mangas.removeIf(manga -> manga.getQuantidade() == 0);

        System.out.println(mangas);

    }
}
