package org.example.javacore.Zgenerics.test;

import org.example.javacore.Zgenerics.dominio.Barco;
import org.example.javacore.Zgenerics.dominio.Carro;
import org.example.javacore.Zgenerics.service.BarcoRentavelService;
import org.example.javacore.Zgenerics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest03 {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"),
                new Carro("FUSCA")));


        List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Canoa"),
                new Barco("Iate")));

        RentalService<Carro> rentalServiceCar = new RentalService<>(carrosDisponiveis);
        Carro carro = rentalServiceCar.buscarObjetoDisponivel();
        System.out.println("Usando o carro por um mês..");
        rentalServiceCar.retornarObjetoAlugado(carro);

        RentalService<Barco> rentalServiceBarco = new RentalService<>(barcosDisponiveis);
        Barco barco = rentalServiceBarco.buscarObjetoDisponivel();
        System.out.println("Usando o barco por um mês..");
        rentalServiceBarco.retornarObjetoAlugado(barco);

    }
}
