package org.example.javacore.Aintroducaoclasses.test;

import org.example.javacore.Aintroducaoclasses.dominio.Pessoa;

public class PessoaTest01 {

    public static void main(String[] args) throws Exception {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Jiraya");
        pessoa.setIdade(0);

        pessoa.imprime();

    }

}
