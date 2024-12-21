package org.example.javacore.ZZBComportamento.test;

import org.example.javacore.ZZBComportamento.dominio.Car;
import org.example.javacore.ZZBComportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest02 {

    private static List<Car> carList = new ArrayList<>(List.of(new Car(2011, "Green"), new Car(2008, "White"), new Car(2020, "Black")));

    public static void main(String[] args) {
//        List<Car> greenCars = filter(carList, new CarPredicate() {
//            @Override
//            public boolean test(Car car) {
//                return car.getColor().equals("Green");
//            }
//        });

        List<Car> greenCars = filter(carList, car -> car.getColor().equals("Green"));
        List<Car> blackCars = filter(carList, car -> car.getColor().equals("Black"));
        List<Car> whiteCars = filter(carList, car -> car.getColor().equals("White"));
        List<Car> oldCars = filter(carList, car -> car.getYear() < 2016);

        System.out.println(greenCars);
        System.out.println(blackCars);
        System.out.println(whiteCars);

        System.out.println(oldCars);
    }

    private static List<Car> filter(List<Car> cars, Predicate<Car> carPredicate) {
        List<Car> filteredCar = new ArrayList<>();
        for (Car car : cars) {
            if (carPredicate.test(car)) {
                filteredCar.add(car);
            }
        }

        return filteredCar;
    }


}
