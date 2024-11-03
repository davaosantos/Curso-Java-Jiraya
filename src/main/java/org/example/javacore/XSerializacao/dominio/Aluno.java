package org.example.javacore.XSerializacao.dominio;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Aluno implements Serializable {
    private static final long serialVersionUID = -7875737608912648669L;
    private Long id ;

    private String nome;
    private transient String password;

    private transient Turma turma;

    private static final String NOME_ESCOLA = "mourão";

    public Aluno(Long id, String nome, String password) {
        this.id = id;
        this.nome = nome;
        this.password = password;
    }


    private void writeObject(ObjectOutputStream oos) throws IOException {
      oos.defaultWriteObject();
      oos.writeUTF(turma.getNomeTurma());
    };

    private void readObject(ObjectInputStream ios) throws IOException, ClassNotFoundException {
        ios.defaultReadObject();
        String nomeTurma = ios.readUTF();
        Turma turma1 = new Turma(nomeTurma);
    };

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", password='" + password + '\'' +
                ", NOME_ESCOLA='" + NOME_ESCOLA + '\'' +
                ", TURMA='" + turma + '\'' +
                '}';
    }
}
