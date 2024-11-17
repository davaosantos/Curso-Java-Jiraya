package org.example.javacore.YColecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {

    public static void main(String[] args) {
//        List nomes = new ArrayList<>(); //1.4
        List<String> nomes = new ArrayList<>(16);
        List<String> nomes2 = new ArrayList<>(16);
        nomes.add("David");
        nomes.add("Angelina");
        nomes.add("Seila");

        nomes2.add("Suane");
        nomes2.add("Jhonis");
        nomes2.add("Willis");

        nomes.addAll(nomes2);

        nomes.remove(0);
        System.out.println(nomes.remove("Seila"));


//        for (String nome : nomes) {
//            nomes.add(nome);
//        }

        int sizeNomes = nomes.size();
        for (int i = 0; i < sizeNomes; i++){
            nomes.add("David");
        }

        System.out.println(nomes);


//        for (Object nome : nomes) {
//            System.out.println(nome);
//        }

        for (String nome : nomes) {
            System.out.println(nome);
        }

        nomes.add("Suane");

        System.out.println("-------");
        for (int i = 0; i < nomes.size() ; i++){
            System.out.println(nomes.get(i));
        }

        List<Integer> integers = new ArrayList<>();
        integers.add(1);

//        List<int>

    }
}
