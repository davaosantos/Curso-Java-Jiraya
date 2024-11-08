package org.example.javacore.Labstratas.dominio;

public class Gerente extends Funcionario {
    public Gerente(String nome, Double salario) {
        super(nome, salario);
    }

    @Override
    public void calculaBonos() {
        this.salario = this.salario + this.salario * 0.2;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }

}
