package org.example.javacore.Npolimorfismo.test;

import org.example.javacore.Npolimorfismo.dominio.Computador;
import org.example.javacore.Npolimorfismo.dominio.Produto;
import org.example.javacore.Npolimorfismo.dominio.Tomate;

public class ProdutoTest02 {

    public static void main(String[] args) {
        Produto produto = new Computador("LENOVO IDEAPAD S145", 1500.0);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());

        Produto produto2 = new Tomate("AMERICANO", 22.0);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());
        System.out.println(produto2.getDataValidade);

        Tomate tomate = new Tomate("AMERIC", 15.0);
        tomate.getDataValidade();
    }
}
