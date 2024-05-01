package org.example.javacore.Aintroducaoclasses.dominio;

public class Pessoa {

    private String nome;

    private Integer idade;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) throws Exception{

        if (idade < 1){
            throw new Exception("Idade inválida");
        }
        this.idade = idade;
    }
}
