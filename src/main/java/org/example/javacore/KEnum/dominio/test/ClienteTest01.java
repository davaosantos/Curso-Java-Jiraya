package org.example.javacore.KEnum.dominio.test;

import org.example.javacore.KEnum.dominio.Cliente;
import org.example.javacore.KEnum.dominio.TipoCliente;

public class ClienteTest01 {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("TSUBASA",
                TipoCliente.PESSOA_FISICA);

        Cliente cliente2 = new Cliente("SEYA",
                TipoCliente.PESSOA_JURIDICA);

        Cliente cliente3 = new Cliente("ROLIN",
                TipoCliente.PESSOA_FISICA);


        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);

    }
}
