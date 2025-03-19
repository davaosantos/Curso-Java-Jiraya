package org.example.javacore.ZZGConcorrencia.test;

import java.util.concurrent.*;

class RandomNumberCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        int count = ThreadLocalRandom.current().nextInt(1, 11);

        for (int i = 0; i < count; i++){
            System.out.printf("%s executando uma tarefa callable ... %n", Thread.currentThread().getName());
        }

        return String.format("%s finished and random number is %d", Thread.currentThread().getName(), count);
    }
}

public class CallableTest01 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        RandomNumberCallable randomNumberCallable = new RandomNumberCallable();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<String> future = executorService.submit(randomNumberCallable);
        String s = future.get(); // o método get do Future , faz com que o Executor tenha que finalizar a execução do Callable , para dar continuidade .
        System.out.printf("Program finished %s", s);
        executorService.shutdown();
    }
}
