package org.example.javacore.KEnum.dominio.test;

import org.example.javacore.KEnum.dominio.Cliente;
import org.example.javacore.KEnum.dominio.TipoCliente;
import org.example.javacore.KEnum.dominio.TipoPagamento;

public class ClienteTest01 {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("SHIRYU",
                TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);

        Cliente cliente2 = new Cliente("SEYA",
                TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));

        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente);

        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Fisica");
        System.out.println(tipoCliente2);

        System.out.println(tipoCliente.getNmRelatorio());
        System.out.println(tipoCliente2.getNmRelatorio());

    }
}
