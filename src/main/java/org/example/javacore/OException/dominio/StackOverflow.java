package org.example.javacore.OException.dominio;

public class StackOverflow {

    public static void main(String[] args) {
        recursividade();
    }

    public static void recursividade(){
        recursividade();
    }
}
