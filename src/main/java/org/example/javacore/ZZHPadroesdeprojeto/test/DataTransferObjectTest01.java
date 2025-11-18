//package org.example.javacore.ZZHPadroesdeprojeto.test;
//
//import org.example.javacore.ZZHPadroesdeprojeto.dominio.*;
//
//
//public class DataTransferObjectTest01 {
//    public static void main(String[] args) {
//        Aircraft aircraft = new Aircraft("777");
//        CountryEnum country = CountryEnum.BRASIL;
//        Currency currency = CurrencyFactory.newCurrency(country);
//        Person person = Person.PersonBuilder
//                .builder()
//                .firstName("William")
//                .lastName("Suane")
//                .build();
//        ReportDto reportDto = ReportDto.ReportDtoBuilder.builder()
//                .aircraftName(aircraft.getName())
//                .country(country)
//                .currency(currency)
//                .personName(person.getFirstName())
//                .build();
//
//        System.out.println(reportDto);
//    }
//}
