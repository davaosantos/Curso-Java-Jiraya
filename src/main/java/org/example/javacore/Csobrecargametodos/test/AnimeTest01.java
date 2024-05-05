package org.example.javacore.Csobrecargametodos.test;

import org.example.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {

    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Naruto", "TV", 5);
        anime.init("Naruto", "TV", 5, "Ação");
        anime.imprime();
    }
}
