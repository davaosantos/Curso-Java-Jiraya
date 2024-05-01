package org.example.javacore.Aintroducaoclasses.Bintroducaometodos.exercicio;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class Funcionario {

    private String nome;

    private Integer idade;

    private Double[] salarios;

    private Double media = 0.0;

    public Funcionario() {
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(Double[] salarios) {
        this.salarios = salarios;
    }

    public Funcionario(String nome, Integer idade, Double[] salarios) {
        this.nome = nome;
        this.idade = idade;
        this.salarios = salarios;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);

        for (Double salario :salarios
             ) {
            System.out.println("Salario: " + salario);
        }
    }

    public void imprimeResultado() {
        if (salarios == null){
            return;
        }

        Double vlTotal = Arrays.stream(this.salarios).mapToDouble(salario -> salario).sum();
        System.out.println("Total " + vlTotal);
    }

    public void imprimeMediaSalarial() {

        if (salarios == null){
            return;
        }

        for (double salario : salarios){
            media += salario;
        }

        media /= salarios.length;

        System.out.println("\n Média Salarial " + media);
    }

    public Double getMedia() {
        return media;
    }
}
