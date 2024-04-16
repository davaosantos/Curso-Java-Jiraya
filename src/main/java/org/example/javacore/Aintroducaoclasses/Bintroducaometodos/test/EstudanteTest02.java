package org.example.javacore.Aintroducaoclasses.Bintroducaometodos.test;

import org.example.javacore.Aintroducaoclasses.Bintroducaometodos.dominio.Estudante;
import org.example.javacore.Aintroducaoclasses.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest02 {

    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante1.setNome("David");
        estudante1.setIdade(15);
        estudante1.setSexo('M');

        estudante2.setNome("Ferna");
        estudante2.setIdade(23);
        estudante2.setSexo('F');

        estudante1.imprime();
        estudante2.imprime();
    }
}
