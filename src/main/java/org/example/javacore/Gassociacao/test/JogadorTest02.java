package org.example.javacore.Gassociacao.test;

import org.example.javacore.Gassociacao.dominio.Jogador;
import org.example.javacore.Gassociacao.dominio.Time;

public class JogadorTest02 {

    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Time time = new Time("Corinthians");

        jogador1.imprime();
        jogador1.setTime(time);
        jogador1.imprime();
    }
}
