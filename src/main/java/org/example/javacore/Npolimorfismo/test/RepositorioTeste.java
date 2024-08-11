package org.example.javacore.Npolimorfismo.test;

import org.example.javacore.Npolimorfismo.repositorio.Repositorio;
import org.example.javacore.Npolimorfismo.servico.RepositorioArquivo;
import org.example.javacore.Npolimorfismo.servico.RepositorioBancoDeDados;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RepositorioTeste {

    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioArquivo();
        repositorio.salvar();

        List<String> list = new LinkedList<>();
    }
}
