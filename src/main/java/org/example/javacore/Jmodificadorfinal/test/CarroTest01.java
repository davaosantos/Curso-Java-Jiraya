package org.example.javacore.Jmodificadorfinal.test;

import org.example.javacore.Jmodificadorfinal.dominio.Carro;
import org.example.javacore.Jmodificadorfinal.dominio.Ferrari;

public class CarroTest01 {

    public static void main(String[] args) {
        Carro carro = new Carro();

        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        System.out.println("------------- DEPOIS DE SETAR ----------");
        carro.COMPRADOR.setNome("DAVID ALERRSO");
        System.out.println(carro.COMPRADOR);
        Ferrari ferrari = new Ferrari();
        ferrari.setNome("FERRARII");
        ferrari.imprime();

    }
}
