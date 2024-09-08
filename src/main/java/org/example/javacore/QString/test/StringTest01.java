package org.example.javacore.QString.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome  = "David"; // String constant pool
        String nome2 = "David";
        nome = nome.concat(" Suane");
        System.out.println(nome);
        System.out.println(nome == nome2);

        String nome3 = new String("David"); // 1 Var de referencia , 2 objeto do tipo String , 3 uma String no pool de String
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());

    }
}
