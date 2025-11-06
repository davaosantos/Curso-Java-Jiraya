package org.example.javacore.ZZHPadroesdeprojeto.test;

import org.example.javacore.ZZHPadroesdeprojeto.dominio.AircraftSingletonEager;
import org.example.javacore.ZZHPadroesdeprojeto.dominio.AircraftSingletonLazy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class AircraftLazyInitializationTest01 {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        bookSeat("1A");
        bookSeat("1A");

        System.out.println(AircraftSingletonLazy.getInstance());
        System.out.println(AircraftSingletonLazy.getInstance());
        Constructor<AircraftSingletonLazy> declaredConstructor = AircraftSingletonLazy.class.getDeclaredConstructor(String.class);
        declaredConstructor.setAccessible(true);
        AircraftSingletonLazy aircraftSingletonLazy = declaredConstructor.newInstance("787-800");
        System.out.println(aircraftSingletonLazy);
    }

    private static void bookSeat(String seat){
        AircraftSingletonLazy aircraftSingletonLazy = AircraftSingletonLazy.getInstance();
    }
}
