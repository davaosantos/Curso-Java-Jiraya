package org.example.javacore.Eblocosinicializacao.test;

import org.example.javacore.Eblocosinicializacao.domain.Anime;

public class AnimeTest01 {

    public static void main(String[] args) {
        Anime anime = new Anime("Dragonball");

        for (int episodio : anime.getEpisodios()) {
            System.out.println(episodio + " ");
        }
    }
}
