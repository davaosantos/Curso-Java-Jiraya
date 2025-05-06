package org.example.javacore.ZZGConcorrencia.test;

import java.util.concurrent.*;

public class FutureTest01 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Double> dolarRequest = executorService.submit(() -> {
            TimeUnit.SECONDS.sleep(15);
            return 4.35D;
        });

        System.out.println(doSomething());
        Double dolarResponse = null;
        try {
            dolarResponse = dolarRequest.get(3, TimeUnit.SECONDS);
        } catch (TimeoutException e) {
            throw new RuntimeException(e);
        }finally {
            executorService.shutdown();
        }
        System.out.println("Dollar : " + dolarResponse);
    }

    //Será executada pela Thread Main ao mesmo tempo
    public static long doSomething(){
        System.out.println(Thread.currentThread().getName());

        long sum = 0L;
        for (int i = 0; i < 1_000_000; i++){
            sum += i;
        }

        return sum;
    }
}
