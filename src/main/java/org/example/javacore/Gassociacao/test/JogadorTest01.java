package org.example.javacore.Gassociacao.test;

import org.example.javacore.Gassociacao.dominio.Jogador;

public class JogadorTest01 {

    public static void main(String[] args) {
        Jogador jogador = new Jogador("Herrera");
        Jogador jogador2 = new Jogador("Romario");
        Jogador jogador3 = new Jogador("Cafu");

        //Jogador[] jogadores = new Jogador[3];
        Jogador[] jogadores = {jogador, jogador2, jogador3};

        for (Jogador j : jogadores) {
            j.imprime();
        }

    }
}
