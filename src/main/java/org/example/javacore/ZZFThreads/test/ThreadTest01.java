package org.example.javacore.ZZFThreads.test;


class ThreadExample extends Thread{
    private final char c;

    public ThreadExample(char c){
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0 ; i < 300; i++){
            System.out.print(c);
            if (i % 100 == 0){
                System.out.println();
            }
        }
    }
}

class ThreadExampleRunable implements Runnable{
    private final char c;

    public ThreadExampleRunable(char c){
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0 ; i < 300; i++){
            System.out.print(c);
            if (i % 100 == 0){
                System.out.println();
            }
        }
    }
}

//Daemon X User
public class ThreadTest01 {
    public static void main(String[] args) {
//        ThreadExample t1 = new ThreadExample('A');
//        ThreadExample t2 = new ThreadExample('B');
//        ThreadExample t3 = new ThreadExample('C');
//        ThreadExample t4 = new ThreadExample('D');


        Thread t1 = new Thread(new ThreadExample('A')) ;
        Thread t2 = new Thread(new ThreadExample('B')) ;
        Thread t3 = new Thread(new ThreadExample('C')) ;
        Thread t4 = new Thread(new ThreadExample('D')) ;

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        System.out.println("####################################################" + Thread.currentThread().getName());

//        t1.run();
//        t2.run();
//        t3.run();
//        t4.run();


    }
}
