package org.example.javacore.ZZDOptional.test;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class OptionalTest01 {

    public static void main(String[] args) {
        Optional<String> o1 = Optional.of("Aha uhu o devdojo é f");
        Optional<String> o2 = Optional.ofNullable(null);
        Optional<String> o3 = Optional.empty();
        System.out.println(o1);
        System.out.println(o2);

        System.out.println("--------OPTIONAL VAZIO -----");
        Optional<String> nameOptional = findName("Alisson");
        System.out.println(nameOptional);

        String vazio = nameOptional.orElse("Vazio");
        System.out.println(vazio);

        System.out.println("--------- OPTIONAL ENCONTRADO -------");
        Optional<String> nameOptionalEncontrado = findName("Sasuke");
        System.out.println(nameOptionalEncontrado);
        nameOptionalEncontrado.ifPresent(s -> System.out.println(s.toUpperCase()));

    }

    private static Optional<String> findName(String name){
        List<String> nomes = List.of("Naruto", "Sasuke", "Megumi", "Itadori");
        int i = nomes.indexOf(name);

        if (i != -1){ // IndexOf -> 0 é que encontrou , -1 nao encontrou
            return Optional.of(nomes.get(i));
        }

        return Optional.empty();
    }
}
