package org.example.javacore.Zgenerics.test;

import org.example.javacore.Zgenerics.dominio.Barco;
import org.example.javacore.Zgenerics.service.BarcoRentavelService;

public class ClasseGenericaTest02 {
    public static void main(String[] args) {
        BarcoRentavelService BarcoRentavelService = new BarcoRentavelService();
        Barco Barco = BarcoRentavelService.buscarBarcoDisponivel();
        System.out.println("Usando Barco por um mês....");
        BarcoRentavelService.retornarBarcoAlugado(Barco);

    }
}
