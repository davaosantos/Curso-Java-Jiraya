package org.example.javacore.ZZGConcorrencia.test;

import org.example.javacore.ZZGConcorrencia.service.StoreService;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CompletableFutureTest02 {
    public static void main(String[] args) {

        StoreService storeService = new StoreService();
        searchPricesAsyncCompletableFuture(storeService);
    }

    private static void searchPricesAsyncCompletableFuture(StoreService storeService){
        long start = System.currentTimeMillis();
        List<String> stores = List.of("Store 1", "Store 2", "Store 3", "Store 4");

//        List<Double> prices = stores.stream()
//                .map(storeService::getPricesAsyncCompletableFuture)
//                .map(CompletableFuture::join)
//                .collect(Collectors.toList());

        List<CompletableFuture<Double>> completableFutures = stores.stream()
                .map(storeService::getPricesAsyncCompletableFuture)
                .collect(Collectors.toList());

        List<Double> prices = completableFutures.stream().map(CompletableFuture::join).collect(Collectors.toList());

        System.out.println(prices);

        long end = System.currentTimeMillis();
        System.out.printf("Time passed searchPricesSync %d%n", (end-start));
    }

    //Lista de completableFuture
//        List<CompletableFuture<Double>> collect = stores.stream()
//                .map(storeService::getPricesAsyncCompletableFuture)
//                .collect(Collectors.toList());
}
