package org.example.javacore.XSerializacao.test;

import org.example.javacore.XSerializacao.dominio.Aluno;
import org.example.javacore.XSerializacao.dominio.Turma;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializacaoTest01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(1L, "David", "repolho123");
        Turma turma = new Turma("Mouralistas");
        aluno.setTurma(turma);
        serializar(aluno);
        deserializar();
    }

    private static void serializar(Aluno aluno){
        Path path = Paths.get("src/pasta/alunos.ser");
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))){
            oos.writeObject(aluno);
        }catch (IOException exception){

        }
    }

    private static void deserializar(){
        Path path = Paths.get("src/pasta/alunos.ser");
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))){
            Aluno aluno = (Aluno) ois.readObject();
            System.out.println(aluno);
        }catch (IOException | ClassNotFoundException exception){
            exception.printStackTrace();
        }
    }
}
