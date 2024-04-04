package org.example.javacore.Aintroducaoclasses.Bintroducaometodos.test;

import org.example.javacore.Aintroducaoclasses.Bintroducaometodos.dominio.Estudante;
import org.example.javacore.Aintroducaoclasses.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {

    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        ImpressoraEstudante impressoraEstudante = new ImpressoraEstudante();

        estudante1.setNome("David");
        estudante1.setIdade(15);
        estudante1.setSexo('M');

        estudante2.setNome("Ferna");
        estudante2.setIdade(23);
        estudante2.setSexo('F');

        impressoraEstudante.imprime(estudante1);
        impressoraEstudante.imprime(estudante2);

    }
}
