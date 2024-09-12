package org.example.javacore.QString;

public class StringBuilderTest01 {

    public static void main(String[] args) {
        String nome = "David";
        nome.concat(" Alisson");
        nome = nome.substring(0,3);
        System.out.println(nome);

        StringBuilder sb = new StringBuilder("David");
        sb.append(" DevDojo");
        sb.reverse();
        sb.reverse();
        sb.delete(0,2);
        System.out.println(sb);
    }
}
