package org.example.javacore.YColecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);
        mangas.add("Attack on titan");
        mangas.add("Vinland Saga");
        mangas.add("Bersek");
        mangas.add("Death Note");
        mangas.add("Dragon Ball");
        mangas.add("CDZ");

        Collections.sort(mangas);

        for (String manga : mangas){
            System.out.println(manga);
        };

        List<Double> dinheiros = new ArrayList<>();
        dinheiros.add(100.21);
        dinheiros.add(203.22);
        dinheiros.add(25.99);

        Collections.sort(dinheiros);

        System.out.println(dinheiros);
    }
}
