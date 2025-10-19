package org.example.javacore.ZZHPadroesdeprojeto.test;

import org.example.javacore.ZZHPadroesdeprojeto.dominio.CountryEnum;
import org.example.javacore.ZZHPadroesdeprojeto.dominio.Currency;
import org.example.javacore.ZZHPadroesdeprojeto.dominio.CurrencyFactory;

public class CurrencyFactoryTest01 {
    public static void main(String[] args) {
        Currency currency = CurrencyFactory.newCurrency(CountryEnum.BRASIL);
        System.out.println(currency.getSymbol());
    }
}
