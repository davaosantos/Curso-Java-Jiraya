package org.example.javacore.Gassociacao.test;

import org.example.javacore.Gassociacao.dominio.Jogador;
import org.example.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {

    public static void main(String[] args) {
        Jogador jogador = new Jogador("Cafu");
        Jogador jogador2 = new Jogador("Danilo");
        Time time = new Time("Brasil");
        Jogador[] jogadores = {jogador, jogador2};

        jogador.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("-- Jogador --");
        jogador.imprime();

        System.out.println("-- Time --");
        time.imprime();
    }

}
