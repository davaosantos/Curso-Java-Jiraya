package org.example.javacore.Aintroducaoclasses.test;

import org.example.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {

    public static void main(String[] args) {

        Carro carro1 = new Carro();
        carro1.nome = "Fusca bala";
        carro1.modelo = "Sport";
        carro1.ano = 1969;

        Carro carro2 = new Carro();
        carro2.nome = "Mustang";
        carro2.modelo = "GT 500";
        carro2.ano = 1968;

        carro1 = carro2;

        System.out.println(carro1.ano);
        System.out.println(carro1.nome);
        System.out.println(carro1.modelo + "\n");

        System.out.println("---CARRO 2 --");
        System.out.println(carro2.ano);
        System.out.println(carro2.nome);
        System.out.println(carro2.modelo + "\n");

    }
}
