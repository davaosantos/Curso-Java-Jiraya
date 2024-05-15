package org.example.javacore.Eblocosinicializacao.domain;

public class Anime {

    private String nome;
    private int[] episodios;

    //1 - Alocado espaço em memória para o objeto
    //2 - Cada atributo de classe é criado e inicializado com valores DEFAULT , ou o que for passado (null para objetos , 0 para inteiro , false para boolean)
    //3- Bloco de inicialização é executado
    //4- Construtor é executado

    {
        System.out.println("Dentro do bloco de inicicialização");
        episodios = new int[100];

        for (int i = 0; i < episodios.length; i++){
            episodios[i] = i + 1;
        }
    }

    public Anime() {
        System.out.println(this.episodios);

        for (int ep : this.episodios){
            System.out.println(ep + " ");
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int[] episodios) {
        this.episodios = episodios;
    }
}
