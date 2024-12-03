package org.example.javacore.YColecoes.test;

import org.example.javacore.YColecoes.dominio.Consumidor;
import org.example.javacore.YColecoes.dominio.Manga;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {

    public static void main(String[] args) {

//        Consumidor consumidor = new Consumidor("David");
//        Queue<Consumidor> consumidorQueue = new PriorityQueue<>();
//        consumidorQueue.add(consumidor);

        Queue<Manga> mangaQueue = new PriorityQueue<>(new MangaPrecoComparator().reversed());
        mangaQueue.add(new Manga(1L, "Attack on titan", 10.0, 0));
        mangaQueue.add(new Manga(4L,"Vinland Saga", 15.2,  2));
        mangaQueue.add(new Manga(3L, "Bersek", 13.0, 4));
        mangaQueue.add(new Manga(2L, "Death Note", 14.3, 3));
        mangaQueue.add(new Manga(6L, "Dragon Ball", 3.3, 1));
        mangaQueue.add(new Manga(5L, "CDZ", 4.5, 0));
        mangaQueue.add(new Manga(10L, "Aaragon", 4.5, 0));

        while (!mangaQueue.isEmpty()){
            System.out.println(mangaQueue.poll());
        }
    }
}
