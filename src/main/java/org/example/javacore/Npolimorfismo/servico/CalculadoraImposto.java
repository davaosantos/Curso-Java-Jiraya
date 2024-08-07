package org.example.javacore.Npolimorfismo.servico;

import org.example.javacore.Npolimorfismo.dominio.Computador;
import org.example.javacore.Npolimorfismo.dominio.Produto;
import org.example.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {

    public static void calcularImposto(Produto produto){
        System.out.println("Relatório de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto : " + produto.getNome());
        System.out.println("Preço : " + produto.getValor());
        System.out.println("Imposto a ser pago : " + imposto);
    }


}
