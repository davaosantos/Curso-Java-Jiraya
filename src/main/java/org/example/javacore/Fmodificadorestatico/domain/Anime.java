package org.example.javacore.Fmodificadorestatico.domain;

public class Anime {

    private String nome;
    private static int[] episodios;

    //0 - Bloco de inicialização é executado quando a JVM carregar a classe
    //1 - Alocado espaço em memória para o objeto
    //2 - Cada atributo de classe é criado e inicializado com valores DEFAULT , ou o que for passado (null para objetos , 0 para inteiro , false para boolean)
    //3- Bloco de inicialização é executado
    //4- Construtor é executado

    static {
        System.out.println("Dentro do bloco de inicicialização");
        episodios = new int[100];

        for (int i = 0; i < episodios.length; i++){
            episodios[i] = i + 1;
        }
    }

    static {
        System.out.println("BLOCO 1 ESTÁTICO");
    }

    {
        System.out.println("BLOCO NAO ESTÁTICO 1");
    }
    static {
        System.out.println("BLOCO 2 ESTÁTICO");
    }

    static {
        System.out.println("BLOCO 3 ESTÁTICO");
    }


    public Anime() {
        for (int ep : Anime.episodios){
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

    public static int[] getEpisodios() {
        return episodios;
    }

    public static void setEpisodios(int[] episodios) {
        Anime.episodios = episodios;
    }
}
