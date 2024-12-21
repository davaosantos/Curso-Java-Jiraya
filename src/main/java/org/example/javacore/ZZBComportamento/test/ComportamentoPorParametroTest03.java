package org.example.javacore.ZZBComportamento.test;

import org.example.javacore.ZZBComportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest03 {

    private static List<Car> carList = new ArrayList<>(List.of(new Car(2011, "Green"), new Car(2008, "White"), new Car(2020, "Black")));

    public static void main(String[] args) {

        //Dessa forma só para exemplificar
        List<Car> greenCars = filter(carList, (Car car) -> {
            return car.getColor().equals("Green");
        });

        List<Car> blackCars = filter(carList, car -> car.getColor().equals("Black"));
        List<Car> whiteCars = filter(carList, car -> car.getColor().equals("White"));
        List<Car> oldCars = filter(carList, car -> car.getYear() < 2016);

        System.out.println(greenCars);
        System.out.println(blackCars);
        System.out.println(whiteCars);

        System.out.println(oldCars);

        System.out.println("Validação de numeros");
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(filter(integers, i -> i % 2 == 0));
    }

    private static <T> List<T> filter(List<T> listParam, Predicate<T> predicate) {
        List<T> filteredList = new ArrayList<>();
        for (T e : listParam) {
            if (predicate.test(e)) {
                filteredList.add(e);
            }
        }

        return filteredList;
    }

}
