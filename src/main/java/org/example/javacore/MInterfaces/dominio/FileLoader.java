package org.example.javacore.MInterfaces.dominio;

public class FileLoader implements DataLoader, DataRemover{

    @Override
    public void load() {
        System.out.println("Carregando dados de um arquivo");
    }

    @Override
    public void remove() {
        System.out.println("Deletando arquivos");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissoes no FileLoader");
    }
}
