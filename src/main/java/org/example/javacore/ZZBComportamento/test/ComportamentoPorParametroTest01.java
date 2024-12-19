package org.example.javacore.ZZBComportamento.test;

import org.example.javacore.ZZBComportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {

    private static List<Car> carList = new ArrayList<>(List.of(new Car(2011, "Green"), new Car(2008, "White"), new Car(2020, "Black")));
    public static void main(String[] args) {
        System.out.println(filterGreenCar(carList));
        System.out.println(filterBlackCar(carList));
        System.out.println(filterCarByColor(carList, "Green"));
        System.out.println(filterCarByColor(carList, "Black"));
        System.out.println("--------");
        System.out.println(filterByYearBefore(carList, 2016));
    }

    private static List<Car> filterCarByColor(List<Car> cars, String color) {
        List<Car> filteredCar = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals(color)) {
                filteredCar.add(car);
            }
        }

        return filteredCar;
    }

    private static List<Car> filterByYearBefore(List<Car> cars, int year) {
        List<Car> oldCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYear() < year) {
                oldCars.add(car);
            }
        }

        return oldCars;
    }

    private static List<Car> filterGreenCar(List<Car> cars) {
        List<Car> greenCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals("color")) {
                greenCars.add(car);
            }
        }

        return greenCars;
    }

    private static List<Car> filterBlackCar(List<Car> cars) {
        List<Car> blackCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals("Black")) {
                blackCars.add(car);
            }
        }

        return blackCars;
    }


}
