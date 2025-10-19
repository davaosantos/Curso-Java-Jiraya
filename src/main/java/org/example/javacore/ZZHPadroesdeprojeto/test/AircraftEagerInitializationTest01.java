package org.example.javacore.ZZHPadroesdeprojeto.test;

import org.example.javacore.ZZHPadroesdeprojeto.dominio.Aircraft;
import org.example.javacore.ZZHPadroesdeprojeto.dominio.AircraftSingletonEager;

public class AircraftEagerInitializationTest01 {

    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
        AircraftTest01.bookSeat("1A");
    }

    private static void bookSeat(String seat){
        System.out.println(AircraftSingletonEager.getInstance());
        AircraftSingletonEager aircraftSingletonEager = AircraftSingletonEager.getInstance();
        System.out.println(aircraftSingletonEager);
    }
}
