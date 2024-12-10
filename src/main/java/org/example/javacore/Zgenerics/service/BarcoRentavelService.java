package org.example.javacore.Zgenerics.service;

import org.example.javacore.Zgenerics.dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class BarcoRentavelService {
    private List<Barco> BarcosDisponiveis = new ArrayList<>(List.of(new Barco("Canoa"),
            new Barco("Iate")));

    public Barco buscarBarcoDisponivel(){
        System.out.println("Buscando Barco disponivel...");
        Barco barco = BarcosDisponiveis.remove(0);
        System.out.println("Alugando Barco : " + barco);
        System.out.println("Barcos disponiveis para alugar : ");
        System.out.println(BarcosDisponiveis);
        return barco;
    }

    public void retornarBarcoAlugado(Barco Barco){
        System.out.println("Devolvendo Barco : " + Barco);
        BarcosDisponiveis.add(Barco);
        System.out.println("Barcos disponiveis para alugar : ");
        System.out.println(BarcosDisponiveis);
    }
}
