package org.example.javacore.Rdates.test;

import java.time.Instant;

public class InstantTest01 {

    public static void main(String[] args) {
        //Instant imutavel
        Instant now = Instant.now();
        System.out.println(now.getEpochSecond());
        System.out.println(now.getNano());;
        System.out.println(Instant.ofEpochSecond(3, 1_000_000_000));
    }
}
