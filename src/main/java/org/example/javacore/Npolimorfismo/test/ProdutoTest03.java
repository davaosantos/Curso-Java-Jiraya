package org.example.javacore.Npolimorfismo.test;

import org.example.javacore.Npolimorfismo.dominio.Computador;
import org.example.javacore.Npolimorfismo.dominio.Produto;
import org.example.javacore.Npolimorfismo.dominio.Tomate;
import org.example.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {

    public static void main(String[] args) {
        Produto produto = new Computador("LENOVO IDEAPAD S145", 1500.0);

//        Produto produto2 = new Tomate("AMERICANO", 22.0);

        Tomate tomate = new Tomate("AMERIC", 15.0);
        tomate.setDataValidade("11/12/2025");

        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("-----------");
        CalculadoraImposto.calcularImposto(produto);

    }
}
