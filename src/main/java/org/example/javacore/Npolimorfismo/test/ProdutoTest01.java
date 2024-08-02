package org.example.javacore.Npolimorfismo.test;

import org.example.javacore.Npolimorfismo.dominio.Computador;
import org.example.javacore.Npolimorfismo.dominio.Tomate;
import org.example.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {

    public static void main(String[] args) {
        Computador computador = new Computador("NUC10i7", 11000.0);
        Tomate tomate = new Tomate("Tomate seco", 6.0);

        CalculadoraImposto.calcularImpostoComputador(computador);
        System.out.println("------------------");
        CalculadoraImposto.calcularImpostoTomate(tomate);


    }
}
