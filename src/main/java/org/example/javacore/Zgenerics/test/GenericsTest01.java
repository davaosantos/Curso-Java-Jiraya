package org.example.javacore.Zgenerics.test;

import org.example.javacore.YColecoes.dominio.Consumidor;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {
//        List list = new ArrayList<>();
//        for (Object o : list) {
//            System.out.println(list);
//        }

        //Type Erasure
        List<String> listString = new ArrayList<>();
        listString.add("Goku");

        for (String s : listString) {
            System.out.println(s);
        }
        add(listString, new Consumidor("Midorya"));
        System.out.println("-------- APOS O ADD -----------");

        for (String s : listString) {
            System.out.println(s);
        }
    }
    private static void add (List lista, Consumidor consumidor){
        lista.add(consumidor);
        System.out.println(lista);
    }
}
