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

class MangaPrecoComparator implements Comparator<Manga>{
    @Override
    public int compare(Manga m1, Manga m2) {
        return Double.compare(m1.getPreco(), m2.getPreco());
    }
}

public class NavigableSetTest01 {

    public static void main(String[] args) {
        NavigableSet<SmartPhone> set = new TreeSet<>(new SmartphoneMarcaComparator());
        SmartPhone smartPhone = new SmartPhone("123", "Nokia");
        set.add(smartPhone);
        System.out.println(set);

        System.out.println("-------- MANGAS --------");
        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPrecoComparator());

        mangas.add(new Manga(1L, "Attack on titan", 10.0, 0));
        mangas.add(new Manga(4L,"Vinland Saga", 15.2,  2));
        mangas.add(new Manga(3L, "Bersek", 13.0, 4));
        mangas.add(new Manga(2L, "Death Note", 14.3, 3));
        mangas.add(new Manga(6L, "Dragon Ball", 3.3, 1));
        mangas.add(new Manga(5L, "CDZ", 4.5, 0));
        mangas.add(new Manga(10L, "Aaragon", 4.5, 0));
//        mangas.add(new Manga(10L, "Aaragon 2", 4.5, 0));

//        for (Manga manga : mangas) {
//            System.out.println(manga);
//        }

        for (Manga manga : mangas.descendingSet()) {
            System.out.println(manga);
        }

        Manga yuyu = new Manga(21L, "Yu yu hakusho", 4.5, 2);
        System.out.println("-------- LOWER < ---------");
        System.out.println(mangas.lower(yuyu));
        System.out.println("-------- FLOOR <= ---------");
        System.out.println(mangas.floor(yuyu));
        System.out.println("-------- HIGHER > ---------");
        System.out.println(mangas.higher(yuyu));
        System.out.println("-------- CELLING >= ---------");
        System.out.println(mangas.ceiling(yuyu));

        System.out.println(mangas.size());
        System.out.println(mangas.pollFirst());
        System.out.println(mangas.size());
        System.out.println(mangas.pollLast());
        System.out.println(mangas.size());
    }
}
