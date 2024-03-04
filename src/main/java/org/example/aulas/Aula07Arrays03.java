package org.example.aulas;

public class Aula07Arrays03 {

    public static void main(String[] args) {
        int[] numeros = new int[3]; // inicializando com tamanho
        int[] numerosComValores = {2, 3, 4, 5, 6}; // 5 posições , já com valores
        int[] numeros3 = new int[]{1,2,3,4,5}; // terceira forma , com tamanho e valores

        for (int i = 0; i < numerosComValores.length; i++){
            System.out.println(numerosComValores[i]);
        }

        for (int num : numerosComValores){
            System.out.println(num);
        }

    }
}
