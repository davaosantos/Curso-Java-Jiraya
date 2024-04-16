package org.example.javacore.Aintroducaoclasses.Bintroducaometodos.test;

import org.example.javacore.Aintroducaoclasses.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest5 {
    public static void main(String... args) {
        Calculadora calculadora = new Calculadora();

        int[] numeros = {1,2,3,4,5,6};
        calculadora.somaArray(numeros);

        calculadora.somaVarArgs("David",2,3,4,5);
    }
}
