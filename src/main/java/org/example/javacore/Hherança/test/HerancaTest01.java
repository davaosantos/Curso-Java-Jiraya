package org.example.javacore.Hherança.test;

import org.example.javacore.Hherança.dominio.Endereco;
import org.example.javacore.Hherança.dominio.Funcionario;
import org.example.javacore.Hherança.dominio.Pessoa;

public class HerancaTest01 {

    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setCep("04470-120");
        endereco.setRua("Rua romilda perri");

        Pessoa pessoa = new Pessoa("David");
        pessoa.setCpf("36251991810");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        System.out.println("-------------------");

        Funcionario funcionario = new Funcionario("Alisson");
        funcionario.setCpf("362");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(2044.0);

        funcionario.imprime();
    }
}
