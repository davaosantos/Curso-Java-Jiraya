package org.example.javacore.ZZGConcorrencia.service;

import java.util.concurrent.*;

public class StoreService {

    public static final ExecutorService ex = Executors.newCachedThreadPool();

    public Future<Double> getPricesAsyncFuture(String storeName){
        System.out.printf("Getting prices AssyncFuture for store %s%n", storeName);
        return ex.submit((this::priceGenerator));
    }

    public CompletableFuture<Double> getPricesAsyncCompletableFuture(String storeName){
        System.out.printf("Getting prices AssyncFuture for store %s%n", storeName);
        return CompletableFuture.supplyAsync(this::priceGenerator);
    }

    public void execShutdown(){
        ex.shutdown();
    }

    public double getPriceSync(String storeName){
        System.out.printf("Getting prices sync for store %s%n", storeName);
        return priceGenerator();
    }

    private double priceGenerator(){
        System.out.printf("%s generating price %n", Thread.currentThread().getName());
        delay();
        return ThreadLocalRandom.current().nextInt(0, 500) * 10;
    }

    private void delay(){
        try {
            TimeUnit.SECONDS.sleep(2L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
