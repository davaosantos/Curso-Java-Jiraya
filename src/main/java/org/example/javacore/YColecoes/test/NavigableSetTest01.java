package org.example.javacore.YColecoes.test;

import org.example.javacore.YColecoes.dominio.Manga;
import org.example.javacore.YColecoes.dominio.SmartPhone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneMarcaComparator implements Comparator<SmartPhone>{
    @Override
    public int compare(SmartPhone o1, SmartPhone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

public class NavigableSetTest01 {

    public static void main(String[] args) {
        NavigableSet<SmartPhone> set = new TreeSet<>(new SmartphoneMarcaComparator());
        SmartPhone smartPhone = new SmartPhone("123", "Nokia");
        set.add(smartPhone);
        System.out.println(set);

        System.out.println("-------- MANGAS --------");
        NavigableSet<Manga> mangas = new TreeSet<>();

        mangas.add(new Manga(1L, "Attack on titan", 10.0, 0));
        mangas.add(new Manga(4L,"Vinland Saga", 15.2,  2));
        mangas.add(new Manga(3L, "Bersek", 13.0, 4));
        mangas.add(new Manga(2L, "Death Note", 14.3, 3));
        mangas.add(new Manga(6L, "Dragon Ball", 3.3, 1));
        mangas.add(new Manga(5L, "CDZ", 4.5, 0));
        mangas.add(new Manga(10L, "Aaragon", 4.5, 0));
        mangas.add(new Manga(10L, "Aaragon", 4.5, 0));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }


        System.out.println(mangas);

    }
}
