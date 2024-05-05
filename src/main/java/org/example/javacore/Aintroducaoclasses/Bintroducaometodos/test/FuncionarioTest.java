package org.example.javacore.Aintroducaoclasses.Bintroducaometodos.test;

import org.example.javacore.Aintroducaoclasses.Bintroducaometodos.exercicio.Funcionario;

import java.math.BigDecimal;
import java.util.List;

public class FuncionarioTest {

    public static void main(String... args) {
        Funcionario funcionario = new Funcionario("David", 26, new Double[]{4520.2, 2000.3, 1500.53 } );
        funcionario.imprime();
        funcionario.imprimeResultado();
        funcionario.imprimeMediaSalarial();
    }

    public static void imprimeFuncionario(List<Funcionario> funcionarios){
        funcionarios.stream().forEach(funcionario -> {
            System.out.println("\n " + funcionario);
        });
    }
}
