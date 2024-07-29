package org.example.javacore.Labstratas.dominio;

public abstract class Funcionario extends Pessoa{

    protected String nome;
    protected Double salario;

    @Override
    public void imprime() {
        System.out.println("Imprime");
    }

    public Funcionario(String nome, Double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBonos();
    }

    public abstract void calculaBonos();

}
