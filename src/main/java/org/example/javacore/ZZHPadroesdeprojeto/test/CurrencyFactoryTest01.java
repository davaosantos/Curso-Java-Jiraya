package org.example.javacore.ZZHPadroesdeprojeto.test;

import org.example.javacore.ZZHPadroesdeprojeto.dominio.Country;
import org.example.javacore.ZZHPadroesdeprojeto.dominio.Currency;
import org.example.javacore.ZZHPadroesdeprojeto.dominio.CurrencyFactory;

public class CurrencyFactoryTest01 {
    public static void main(String[] args) {
        Currency currency = CurrencyFactory.newCurrency(Country.BRASIL);
        System.out.println(currency.getSymbol());
    }
}
