package org.example.javacore.ZZDOptional.test.repositorio;

import org.example.javacore.ZZDOptional.test.dominio.Manga;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class MangaRepository {

    public static List<Manga> mangas = List.of(
            new Manga(1, "Boku no hero", 50),
            new Manga(2, "Overlord", 25)
            );

    public static Optional<Manga> findById(Integer id){
        return findBy(m -> m.getId().equals(id));
    }

    public static Optional<Manga> findByTitle(String title){
        return findBy(m -> m.getTitle().equals(title));
    }

    public static Optional<Manga> findBy(Predicate<Manga> predicate){
        Manga mangaFound = null;

        for (Manga manga : mangas) {
            if (predicate.test(manga)){
                mangaFound = manga;
            }
        }

        return Optional.ofNullable(mangaFound);
    }
}
