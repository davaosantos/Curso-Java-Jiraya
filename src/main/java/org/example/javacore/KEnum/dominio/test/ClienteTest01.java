package org.example.javacore.KEnum.dominio.test;

import org.example.javacore.KEnum.dominio.Cliente;
import org.example.javacore.KEnum.dominio.TipoCliente;

import static org.example.javacore.KEnum.dominio.Cliente.TipoPagamento.CREDITO;
import static org.example.javacore.KEnum.dominio.Cliente.TipoPagamento.DEBITO;

public class ClienteTest01 {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("SHIRYU",
                TipoCliente.PESSOA_FISICA, DEBITO);

        Cliente cliente2 = new Cliente("SEYA",
                TipoCliente.PESSOA_JURIDICA, CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);

    }
}
