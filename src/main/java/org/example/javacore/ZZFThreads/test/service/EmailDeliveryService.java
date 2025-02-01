package org.example.javacore.ZZFThreads.test.service;

import org.example.javacore.ZZFThreads.test.dominio.Members;

public class EmailDeliveryService implements Runnable{

    private final Members members;

    public EmailDeliveryService(Members members) {
        this.members = members;
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " starting to deliver emails...");

        while (members.isOpen() || members.pendingEmails() > 0){
            try {
                String email = members.retrieveEmail();

                if (email == null){
                    continue;
                }
                System.out.println(threadName + " Enviando email para " + email);
                Thread.sleep(2000);
                System.out.println("Enviou o email com sucesso para " + email);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("Todos os emails foram enviados com sucesso");
    }
}
