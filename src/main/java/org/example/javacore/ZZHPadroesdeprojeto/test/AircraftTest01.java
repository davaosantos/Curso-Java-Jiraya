package org.example.javacore.ZZHPadroesdeprojeto.test;

import org.example.javacore.ZZHPadroesdeprojeto.dominio.Aircraft;

public class AircraftTest01 {

    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
    }

    static void bookSeat(String seat){
        Aircraft aircraft = new Aircraft("787-800");
        System.out.println(aircraft.bookSeat(seat));
    }
}
