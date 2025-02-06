package org.example.javacore.ZZGConcorrencia.test;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Counter{
    private int count;

    private AtomicInteger atomicInteger = new AtomicInteger();

    private Lock lock = new ReentrantLock();

    void increment(){
//        lock.tryLock(3, TimeUnit.SECONDS)
        lock.lock();

        try{
            count++;
            atomicInteger.incrementAndGet();
        }finally {
            lock.unlock();
        }

    }

    public AtomicInteger getAtomicInteger() {
        return atomicInteger;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}

public class AtomicIntegerTest01 {

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Runnable r = () -> {
            for (int i = 0; i < 10000; i++){
                counter.increment();
            }
        };

        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(counter.getCount());
        System.out.println(counter.getAtomicInteger() + " Com atomic integer");
    }
}
