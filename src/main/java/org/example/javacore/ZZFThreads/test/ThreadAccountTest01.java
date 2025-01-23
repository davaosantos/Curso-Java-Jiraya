package org.example.javacore.ZZFThreads.test;

import org.example.javacore.ZZFThreads.test.dominio.Account;

public class ThreadAccountTest01 implements Runnable{

    private final Account account = new Account();

    public static void main(String[] args) {

        ThreadAccountTest01 threadAccountTest01 = new ThreadAccountTest01();
        Thread t1 = new Thread(threadAccountTest01, "DavidThread");
        Thread t2 = new Thread(threadAccountTest01, "AlissonThread2");

        t1.start();
        t2.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++){
            try {
                withdrawal(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            if (account.getBalance() < 0){
                System.out.println("FODEU");
            }
        }
    }

    private static synchronized void print(){
        synchronized (ThreadAccountTest01.class){}
    }

    private void withdrawal(int amount) throws InterruptedException {

        System.out.println(getThreadName() + " ######### fora do synchronized");
        synchronized (account){
            System.out.println(getThreadName() + " dentro do synchronized");
            if (account.getBalance() >= amount){
                System.out.println(getThreadName() + " está indo sacar dinheiro");
                account.withdrawal(amount);

                System.out.println(getThreadName() + " completou o saque , valor atual da conta " + account.getBalance());
            }else{
                System.out.println("Sem dinheiro para " + getThreadName() + " efetuar o saque " + account.getBalance());
            }
        }

    }

    private static String getThreadName() {
        return Thread.currentThread().getName();
    }
}
