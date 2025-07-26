package org.example.javacore.ZZHPadroesdeprojeto.test;

import org.example.javacore.ZZHPadroesdeprojeto.dominio.Person;

public class BuildPatternTest01 {
    public static void main(String[] args) {
        new Person.PersonBuilder()
                .firstName("David")
                .lastName("Oliveira")
                .username("Dalisson")
                .email("david@gmail.com");

    }
}
