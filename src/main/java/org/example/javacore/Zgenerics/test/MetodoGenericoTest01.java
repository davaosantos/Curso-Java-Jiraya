package org.example.javacore.Zgenerics.test;

import org.example.javacore.Jmodificadorfinal.dominio.Carro;
import org.example.javacore.Zgenerics.dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class MetodoGenericoTest01 {
    public static void main(String[] args) {
        new VariosAtributos<Carro,Gato, Carro >();
        List<Barco> barcoList = criarArrayComObjeto(new Barco("Canoa"));
        System.out.println(barcoList);
    }

    private static <T> List<T> criarArrayComObjeto(T t){
        List<T> list = new ArrayList<>(List.of(t));
        System.out.println(list);

        return list;
    }

//    private static <T extends Comparable<T>> List<T> criarArrayComObjeto(T t){
//        List<T> list = new ArrayList<>(List.of(t));
//        System.out.println(list);
//
//        return list;
//    }
}

class VariosAtributos<T,Y,X>{
    private T t;
    private Y y;
    private X x;

    public VariosAtributos() {
    }

    public VariosAtributos(T t, Y y, X x) {
        this.t = t;
        this.y = y;
        this.x = x;
    }
}
