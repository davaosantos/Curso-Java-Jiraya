package org.example.javacore.Labstratas.test;

import org.example.javacore.Labstratas.dominio.Desenvolvedor;
import org.example.javacore.Labstratas.dominio.Gerente;

public class FuncionarioTest01 {

    public static void main(String[] args) {
        Gerente gerente = new Gerente("David", 5000.0);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Alisso", 12000.0);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
        gerente.imprime();
        desenvolvedor.imprime();


    }


}
