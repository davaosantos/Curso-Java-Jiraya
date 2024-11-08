package org.example.javacore.YColecoes.test;

import org.example.javacore.YColecoes.dominio.SmartPhone;

public class EqualsTest01 {
    public static void main(String[] args) {
//        String nome = "David";
//        String nome2 = "David";
//        String nome3 = new String("David");
//        System.out.println(nome == nome2); // true pois faz referencia ao mesmo objeto em memória , estão ambos no pool de String
//        System.out.println(nome == nome3); // False pois cria outro objeto no heap de memoria
//        System.out.println(nome.equals(nome3)); // Aqui sim compara objeto e valor da String
//Hashcode -> Valida pelo Hash(Indice gerado) , caso não consiga identificar por ele , verifica com o equals


        //Ambos iguais
        SmartPhone s1 = new SmartPhone("1ABC1", "Iphone");
        SmartPhone s2 = new SmartPhone("1ABC1", "Iphone");
        System.out.println(s1.equals(s2)); // Retorna false , pois cada referencia , aponta para um objeto distinto em memória .

        //Só true caso os dois fizessem referencia ao mesmo objeto
        SmartPhone s3 = new SmartPhone("2ABC2", "Iphone");
        SmartPhone s4 = s3;

        System.out.println(s3.equals(s4));
    }

    //Verifica se o valor em memória é igual ao do objeto
//    public boolean equals(Object obj) {
//        return this == obj;
//    }
}
