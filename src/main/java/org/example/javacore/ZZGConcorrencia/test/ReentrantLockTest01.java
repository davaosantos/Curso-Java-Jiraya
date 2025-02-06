package org.example.javacore.ZZGConcorrencia.test;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Worker implements Runnable{
    private String name;
    private ReentrantLock lock;

    public Worker(String name, ReentrantLock lock) {
        this.name = name;
        this.lock = lock;
    }

    @Override
    public void run() {
        lock.lock();

        try {
            if (lock.isHeldByCurrentThread()){
                System.out.printf("Thread %s entrou em uma sessão crítica%n", name);
            }
            System.out.printf("%d Threads esperando na fila%n", lock.getQueueLength());
            System.out.printf("Thread %s vai esperar 2s%n", name);
            Thread.sleep(2000);
            System.out.printf("Thread %s finalizou a espera%n", name);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
    }
}

public class ReentrantLockTest01 {

    public static void main(String[] args) {
        ReentrantLock reentrantLock = new ReentrantLock(true);
        new Thread(new Worker("A", reentrantLock)).start();
        new Thread(new Worker("B", reentrantLock)).start();
        new Thread(new Worker("C", reentrantLock)).start();
        new Thread(new Worker("D", reentrantLock)).start();
        new Thread(new Worker("F", reentrantLock)).start();
        new Thread(new Worker("G", reentrantLock)).start();
    }
}
