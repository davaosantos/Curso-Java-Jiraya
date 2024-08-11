package org.example.javacore.Npolimorfismo.servico;

import org.example.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {

    @Override
    public void salvar() {
        System.out.println("Salvando em arquivo");
    }
}
