package org.example.javacore.Dconstrutores.test;


import org.example.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {

    public static void main(String[] args) {
        Anime anime = new Anime("Davaaao", "TV", 12, "Ação");
        Anime anime2 = new Anime();
//        anime.init("Naruto", "TV", 5);
//        anime.init("Naruto", "TV", 5, "Ação");
        anime.imprime();
        anime2.imprime();
    }
}
