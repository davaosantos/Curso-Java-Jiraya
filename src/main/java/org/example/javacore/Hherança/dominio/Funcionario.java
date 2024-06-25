package org.example.javacore.Hherança.dominio;

public class Funcionario extends Pessoa{

    private Double salario;

    static{
        System.out.println("Dentro do bloco estático de funcionario");
    }

    //Bloco não estático
    {
        System.out.println("Dentro do bloco de inicialização de funcionario NÃO estático 1");
    }

    {
        System.out.println("Dentro do bloco de inicialização de funcionario NÃO estático 2");
    }

    public void imprime(){
        super.imprime();
        System.out.println(this.salario);
    }

    public Funcionario(String nome){
        super(nome);
        System.out.println("Dentro do construtor de funcionario");
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
