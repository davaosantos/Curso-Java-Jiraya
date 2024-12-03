package org.example.javacore.YColecoes.test;

import org.example.javacore.YColecoes.dominio.Consumidor;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest01 {
    public static void main(String[] args) {
        NavigableMap<String, String> navigableMap = new TreeMap<>();
        navigableMap.put("A", "Letra A");
        navigableMap.put("D", "Letra B");
        navigableMap.put("C", "Letra C");
        navigableMap.put("B", "Letra D");
        navigableMap.put("E", "Letra E");


        for (Map.Entry<String, String> navEntry : navigableMap.entrySet()){
            System.out.println(navEntry.getKey() + ":" + navEntry.getValue());
        }

        System.out.println("----------");
        System.out.println(navigableMap.headMap("C", true));
        System.out.println(navigableMap);

        System.out.println(navigableMap.ceilingKey("C"));
        System.out.println(navigableMap.higherKey("C"));
        System.out.println(navigableMap.lowerKey("C"));
        System.out.println(navigableMap.floorKey("C"));

//        Consumidor c1 = new Consumidor("Celso Russomano");
//        Consumidor c2 = new Consumidor("David Alisson");
//
//        NavigableMap<String, Consumidor> navigableMap = new TreeMap<>();
//
//        navigableMap.put("A", c2);
//
//        for (Map.Entry<String, Consumidor> navEntry : navigableMap.entrySet()) {
//            System.out.println(navEntry.getKey() + ":" + navEntry.getValue());
//        }

    }
}
