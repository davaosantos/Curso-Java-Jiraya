package org.example.javacore.Hherança.test;

import org.example.javacore.Hherança.dominio.Pessoa;

public class Funcionario2 extends Pessoa {

    public Funcionario2(String nome) {
        super(nome);
    }

    public void imprime(){
        this.nome = "David";
    }
}
