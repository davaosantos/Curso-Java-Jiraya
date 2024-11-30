package org.example.javacore.YColecoes.test;

import org.example.javacore.YColecoes.dominio.Consumidor;
import org.example.javacore.YColecoes.dominio.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
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

        Map<Consumidor, Manga> consumidorMangaMap = new HashMap<>();
        consumidorMangaMap.put(c1, m1);
        consumidorMangaMap.put(c2, m4);

        for (Map.Entry<Consumidor, Manga> entry : consumidorMangaMap.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
            System.out.println("COM OS ATRIBUTOS : " + entry.getKey().getNome() + ":" + entry.getValue().getNome());
        }

    }
}
