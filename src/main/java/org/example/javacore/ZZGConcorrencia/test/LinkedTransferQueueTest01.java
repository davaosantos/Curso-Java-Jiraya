package org.example.javacore.ZZGConcorrencia.test;

import java.util.concurrent.*;

public class LinkedTransferQueueTest01 {

    public static void main(String[] args) throws InterruptedException {
//        ConcurrentLinkedQueue, SynchronousQueue, LinkedBlockingQueue

        TransferQueue<Object> tfq = new LinkedTransferQueue<>();
        System.out.println(tfq.add("David"));
        System.out.println(tfq.offer("Alisson"));
        System.out.println(tfq.offer("Alisson", 10, TimeUnit.SECONDS));
        tfq.put("Devdojo");

        if (tfq.hasWaitingConsumer()){
            tfq.transfer("Devdojo");
        }

        System.out.println(tfq.tryTransfer("Academy", 5, TimeUnit.SECONDS));
        System.out.println(tfq.element());
        System.out.println(tfq.peek());
        System.out.println(tfq.poll());
        System.out.println(tfq.take());
        System.out.println(tfq.remainingCapacity());

    }
}
