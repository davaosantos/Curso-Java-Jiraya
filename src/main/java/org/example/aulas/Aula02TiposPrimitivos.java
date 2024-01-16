package org.example.aulas;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int , double , float , char , byte , short , long , boolean

        int idade = 10;
        long numeroGrandeLong = 1000800000000000L;
        double salarioDouble = 2000D;
        float salarioFloat = 2500.0F;
        byte idadeByte = 127;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'M';

        int numeroLongToInt = (int) numeroGrandeLong;
        System.out.println(idade);
        System.out.println(caractere);
        System.out.println(falso);
        System.out.println(idadeShort);
        System.out.println(numeroLongToInt);
    }
}
