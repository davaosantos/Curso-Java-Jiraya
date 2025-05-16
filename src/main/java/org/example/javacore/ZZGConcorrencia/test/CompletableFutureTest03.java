package org.example.javacore.ZZGConcorrencia.test;

import org.example.javacore.ZZGConcorrencia.service.StoreServiceDeprecated;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public class CompletableFutureTest03 {
    public static void main(String[] args) {

        StoreServiceDeprecated storeServiceDeprecated = new StoreServiceDeprecated();
        searchPricesSyncCompletableFuture(storeServiceDeprecated);
    }

    private static void searchPricesSyncCompletableFuture(StoreServiceDeprecated storeServiceDeprecated){
        long start = System.currentTimeMillis();
        List<String> stores = List.of("Store 1", "Store 2", "Store 3", "Store 4");

        ExecutorService executor = Executors.newFixedThreadPool(10, runnable -> {
            Thread thread = new Thread(runnable);
            thread.setDaemon(true);
            return thread;
        });

        List<CompletableFuture<Double>> completableFuture = stores.stream()
                .map(s -> CompletableFuture.supplyAsync(() -> storeServiceDeprecated.getPriceSync(s), executor))
                .collect(Collectors.toList());

        List<Double> prices = completableFuture.stream()
                .map(CompletableFuture::join)
                .collect(Collectors.toList());

        System.out.println(prices);

        long end = System.currentTimeMillis();
        System.out.printf("Time passed searchPricesSync %d%n", (end-start));
        executor.shutdown();
    }

}
