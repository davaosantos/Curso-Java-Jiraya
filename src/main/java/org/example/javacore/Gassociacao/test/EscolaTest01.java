package org.example.javacore.Gassociacao.test;

import org.example.javacore.Gassociacao.dominio.Escola;
import org.example.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {

    public static void main(String[] args) {
        Professor professor = new Professor("Amauri");
        Professor professor2 = new Professor("Dolyn");
        Professor[] professores = {professor, professor2};

        Escola escola = new Escola("Zampieri", professores);
        escola.imprime();

    }
}
