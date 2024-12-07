package org.example.javacore.Zgenerics.test;


import java.util.List;

public class WildCardTest02 {

    public static void main(String[] args) {
        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatos = List.of(new Gato(), new Gato());

//        printConsulta(cachorros);
        System.out.println("---------");
    }

    private static void printConsulta(List<Animal> animals){
        for (Animal animal : animals) {
            System.out.println(animal);
        }

        Animal animal = new Cachorro();
        animals.add(new Cachorro());

    }
}
