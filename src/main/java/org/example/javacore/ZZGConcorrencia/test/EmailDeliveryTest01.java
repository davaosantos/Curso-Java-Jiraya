package org.example.javacore.ZZGConcorrencia.test;


import org.example.javacore.ZZGConcorrencia.dominio.Members;
import org.example.javacore.ZZGConcorrencia.service.EmailDeliveryService;

import javax.swing.*;

public class EmailDeliveryTest01 {
    public static void main(String[] args) {
        Members members = new Members();
        Thread thJiraya = new Thread(new EmailDeliveryService(members), "Jiraya");
        Thread thDavid = new Thread(new EmailDeliveryService(members), "Davisson");

        thJiraya.start();
        thDavid.start();

        while(true){
            String email = JOptionPane.showInputDialog("Entre com seu email");
            if (email == null || email.isEmpty()){
                members.close();
                break;
            }

            members.addMemberEmail(email);
        }
    }
}
