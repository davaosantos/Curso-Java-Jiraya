package org.example.javacore.Aintroducaoclasses.Bintroducaometodos.test;

import org.example.javacore.Aintroducaoclasses.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest4 {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        int num1 = 5;
        int num2 = 6;

        calculadora.alteraDoisNumeros(num1, num2);

        System.out.println("Dentro do calculadoraTest \n");
        System.out.println("Num 1 : " + num1 + "\n");
        System.out.println("Num 2 : " + num2 + "\n");

    }
}
