package org.example.javacore.XSerializacao.dominio;

public class Turma {

    private String nomeTurma;

    public Turma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
    }

    public String getNomeTurma() {
        return nomeTurma;
    }

    public void setNomeTurma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
    }

    @Override
    public String toString() {
        return "Turma{" +
                "nomeTurma='" + nomeTurma + '\'' +
                '}';
    }
}
