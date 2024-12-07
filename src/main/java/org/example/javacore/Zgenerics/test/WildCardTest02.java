package org.example.javacore.Zgenerics.test;


import java.util.ArrayList;
import java.util.List;

public class WildCardTest02 {

    public static void main(String[] args) {
        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatos = List.of(new Gato(), new Gato());

        printConsulta(cachorros);
        System.out.println("---------");
    }

    private static void printConsulta(List<? extends Animal> animals){

        Animal animal = new Cachorro();
        Cachorro cachorro = new Animal();
        for (Animal animal : animals) {
            System.out.println(animal);
        }

        Animal animal = new Cachorro();
        animals.add(new Cachorro());

        List<Animal> animals1 = new ArrayList<>();
        List<Cachorro> cachorros = new ArrayList<>();
        List<Object> objects = new ArrayList<>();
        printConsultaAnimal(animals1);
        printConsultaAnimal(cachorros);
//        printConsultaAnimal(objects);

    }

    private static void printConsultaAnimal(List<? super Animal> animals){

        Animal animalCac = new Cachorro();
        Animal animalGato = new Gato();
        animals.add(animalGato);
        animals.add(animalCac);

    }

//    private static void printConsultaAnimal(List<? super Cachorro> animals){
//
//        for (Object animal : animals) {
//            if (animal instanceof Cachorro){
//
//            }
//        }
//
//    }


}
