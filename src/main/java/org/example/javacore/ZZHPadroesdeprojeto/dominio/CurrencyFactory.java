package org.example.javacore.ZZHPadroesdeprojeto.dominio;

public class CurrencyFactory {

    public static Currency newCurrency(CountryEnum country) {

        switch (country) {
            case BRASIL:
                return new Real();
            case USA:
                return new UsDolar();
            default:
                throw new IllegalArgumentException("No currency found for this country");
        }
    }
}
