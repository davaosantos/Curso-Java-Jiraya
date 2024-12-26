package org.example.javacore.ZZDOptional.test;

import org.example.javacore.ZZDOptional.test.dominio.Manga;
import org.example.javacore.ZZDOptional.test.repositorio.MangaRepository;

import java.util.Optional;

public class OptionalTest02 {

    public static void main(String[] args) {
        Optional<Manga> mangaByTitle = MangaRepository.findByTitle("Boku no hero");
        mangaByTitle.ifPresent(m -> m.setTitle("Boku no Hero Alterado"));
        System.out.println(mangaByTitle);

        Manga mangaById = MangaRepository.findById(2).orElseThrow(IllegalArgumentException::new);
        System.out.println(mangaById);

        Manga mangaNovoElseGet = MangaRepository.findByTitle("Drifters")
                .orElseGet(() -> new Manga(3, "Drifters", 20));

        System.out.println(mangaNovoElseGet);

        Manga mangaNovoElse = MangaRepository.findByTitle("Drifters")
                .orElse( new Manga(3, "Drifters", 20));

        System.out.println(mangaNovoElse);
    }
}
