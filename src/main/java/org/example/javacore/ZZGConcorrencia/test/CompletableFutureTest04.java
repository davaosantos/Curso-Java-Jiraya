package org.example.javacore.ZZGConcorrencia.test;

import org.example.javacore.ZZGConcorrencia.dominio.Quote;
import org.example.javacore.ZZGConcorrencia.service.StoreServiceWithDiscount;

import java.util.List;

public class CompletableFutureTest04 {

    public static void main(String[] args) {
        StoreServiceWithDiscount service = new StoreServiceWithDiscount();
        searchPricesWithDiscount(service);
    }

    private static void searchPricesWithDiscount(StoreServiceWithDiscount service){
        List<String> stores = List.of("Store 1", "Store 2", "Store 3", "Store 4");
//        stores.forEach(s -> {
//            System.out.println(service.getPriceSync(s));
//        });

        long start = System.currentTimeMillis();

        stores.stream()
                .map(service::getPriceSync) //retorna store:price:code
                .map(Quote::newQuote) // Aqui tenho o objeto Quote
                .map(service::applyDiscountPrice) // Aqui tenho a String de Discount formatada
                .forEach(System.out::println);

        long end = System.currentTimeMillis();
        System.out.printf("Time passed searchPricesSync %d%n", (end-start));
    }
}
