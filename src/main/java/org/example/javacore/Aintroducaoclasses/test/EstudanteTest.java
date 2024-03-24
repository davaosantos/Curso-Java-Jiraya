package org.example.javacore.Aintroducaoclasses.test;

import org.example.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest {

    public static void main(String[] args) {
        Estudante estudante = new Estudante();

        estudante.nome = "David";
        estudante.idade = 26;
        estudante.sexo = 'M';

        System.out.println(estudante.idade);
        System.out.println(estudante.nome);
        System.out.println(estudante.sexo);
        System.out.println(estudante);
    }
}
