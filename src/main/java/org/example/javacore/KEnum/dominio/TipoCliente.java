package org.example.javacore.KEnum.dominio;

public enum TipoCliente {

    PESSOA_FISICA(1, "Pessoa Fisica"),
    PESSOA_JURIDICA(2, "Pessoa Juridica");

    private int valor;

    private String nmRelatorio;

    public static TipoCliente tipoClientePorNomeRelatorio(String nomeRelatorio){
        for (TipoCliente tipoCliente : values()){
            if (tipoCliente.getNmRelatorio().equalsIgnoreCase(nomeRelatorio)){
                return tipoCliente;
            }
        }
        return null;
    }

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
