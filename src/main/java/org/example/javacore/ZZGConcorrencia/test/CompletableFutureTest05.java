package org.example.javacore.ZZGConcorrencia.test;

import org.example.javacore.ZZGConcorrencia.dominio.Quote;
import org.example.javacore.ZZGConcorrencia.service.StoreServiceWithDiscount;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class CompletableFutureTest05 {

    public static void main(String[] args) {
        StoreServiceWithDiscount service = new StoreServiceWithDiscount();
        searchPricesAsyncWithDiscount(service);
    }


    private static void searchPricesAsyncWithDiscount(StoreServiceWithDiscount service){
        List<String> stores = List.of("Store 1", "Store 2", "Store 3", "Store 4");
        long start = System.currentTimeMillis();

        var completableFutures = stores.stream()
                .map(s -> CompletableFuture.supplyAsync(() -> service.getPriceSync(s)))
                .map(cfs -> cfs.thenApply(Quote::newQuote))
                .map(cfQuote -> cfQuote.thenCompose(quote -> CompletableFuture.supplyAsync(() -> service.applyDiscountPrice(quote))))
                .map(cf -> cf.thenAccept(store -> System.out.printf("%s finished in %d%n", store, (System.currentTimeMillis() - start))))
                .toArray(CompletableFuture[]::new);

        exemploAllOff(completableFutures);
        exemploAnyOff(completableFutures);

        long end = System.currentTimeMillis();
        System.out.printf("Time passed searchPricesSync %d%n", (end-start));
    }

    private static void exemploAnyOff(CompletableFuture[] completableFutures) {
        CompletableFuture<Void> allOffCfs = CompletableFuture.allOf(completableFutures);
        allOffCfs.join();
        System.out.printf("Finished allOf ? %b%n", allOffCfs.isDone());
    }

    private static void exemploAllOff(CompletableFuture[] completableFutures) {
        CompletableFuture<Object> anyOffCfs = CompletableFuture.anyOf(completableFutures);
        anyOffCfs.join();
        System.out.printf("Finished any ? %b%n", anyOffCfs.isDone());
    }
}
