package org.example.javacore.YColecoes.dominio;

import java.util.Objects;

public class Manga  implements Comparable<Manga> {
    private Long id;
    private String nome;

    private double preco;

    private int quantidade;

    public Manga(Long id, String nome, double preco) {
        Objects.requireNonNull(id);
        Objects.requireNonNull(nome);
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public Manga(Long id, String nome, double preco, int quantidade) {
        this(id, nome, preco);
        this.quantidade = quantidade;
    }

    @Override
    public int compareTo(Manga mangaOutro) {
        //Negativo -> Se o this for menor < que o outroManga
        //Igual -> Retorna 0 se o this for igual ao outroManga
        //Positivo -> Retorna positivo se o this for > que o outroManga

        return this.nome.compareTo(mangaOutro.getNome());

//        if (this.id < mangaOutro.getId()){
//            return -1;
//        }
//        else if (this.id.equals(mangaOutro.getId())){
//            return 0;
//        }
//        else{
//            return 1;
//        }

//        return Double.compare(this.preco, mangaOutro.getPreco());


//        return Double.valueOf(this.preco).compareTo(mangaOutro.getPreco());
//        return this.getId().compareTo(mangaOutro.id);
    }

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

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return Objects.equals(id, manga.id) && Objects.equals(nome, manga.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, preco);
    }
}
