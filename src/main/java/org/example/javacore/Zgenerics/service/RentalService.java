package org.example.javacore.Zgenerics.service;

import java.util.List;

public class RentalService<T> {
    private List<T> objetosDisponiveis;

    public RentalService(List<T> objetosDisponiveis) {
        this.objetosDisponiveis = objetosDisponiveis;
    }

    public T buscarObjetoDisponivel(){
        System.out.println("Buscando objeto disponivel...");
        T type = objetosDisponiveis.remove(0);
        System.out.println("Alugando objeto : " + type);
        System.out.println("objetos disponiveis para alugar : ");
        System.out.println(objetosDisponiveis);
        return type;
    }

    public void retornarObjetoAlugado(T type){
        System.out.println("Devolvendo objeto : " + type);
        objetosDisponiveis.add(type);
        System.out.println("objetos disponiveis para alugar : ");
        System.out.println(objetosDisponiveis);
    }
}
