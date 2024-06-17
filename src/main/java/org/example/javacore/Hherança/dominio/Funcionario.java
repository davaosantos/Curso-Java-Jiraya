package org.example.javacore.Hherança.dominio;

public class Funcionario extends Pessoa{

    private Double salario;

    public void imprime(){
        super.imprime();
        System.out.println(this.salario);
    }

    public Funcionario(String nome){
        super(nome);
    }

    public void relatorioPagamento(){
        System.out.println("Eu " + this.nome + " recebi um salario de " + this.salario);
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
