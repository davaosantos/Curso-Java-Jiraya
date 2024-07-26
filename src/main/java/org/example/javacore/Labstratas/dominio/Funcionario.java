package org.example.javacore.Labstratas.dominio;

public abstract class Funcionario {

    protected String nome;
    protected Double salario;

    public Funcionario(String nome, Double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBonos();
    }

    public abstract void calculaBonos();

}
