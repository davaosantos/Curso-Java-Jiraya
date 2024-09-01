package org.example.javacore.OException.exception.test;

import org.example.javacore.OException.exception.dominio.Funcionario;
import org.example.javacore.OException.exception.dominio.LoginInvalidoException;
import org.example.javacore.OException.exception.dominio.Pessoa;

public class SobrescritaComExpTest01 {

    public static void main(String[] args) throws LoginInvalidoException {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        funcionario.salvar();
    }
}
