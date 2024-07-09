package org.example.javacore.KEnum.dominio;

public enum TipoCliente {

    PESSOA_FISICA(1, "Pessoa Fisica"),
    PESSOA_JURIDICA(2, "Pessoa Juridica");

    private int valor;

    private String nmRelatorio;

    TipoCliente(int valor, String nmRelatorio) {
        this.valor = valor;
        this.nmRelatorio = nmRelatorio;
    }

    public int getValor() {
        return valor;
    }

    public String getNmRelatorio() {
        return nmRelatorio;
    }
}
