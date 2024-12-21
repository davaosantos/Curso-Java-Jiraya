package org.example.javacore.ZZBComportamento.interfaces;

import org.example.javacore.ZZBComportamento.dominio.Car;

@FunctionalInterface
public interface CarPredicate {
    //Anonimas , Funções , Conciso
//    boolean test(Car car);

    void test(Car car);
    //(parametro) -> <expressao>

    //(Car car) -> car.getColor().equals("Green");

//    boolean test2(Car car); aqui da erro por ser uma FunctionalInterface

}
