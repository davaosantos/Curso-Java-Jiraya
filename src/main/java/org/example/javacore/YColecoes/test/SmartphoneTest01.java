package org.example.javacore.YColecoes.test;

import org.example.javacore.YColecoes.dominio.SmartPhone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SmartphoneTest01 {
    public static void main(String[] args) {
        SmartPhone s1 = new SmartPhone("123", "Iphone");
        SmartPhone s2 = new SmartPhone("444", "Pixel");
        SmartPhone s3 = new SmartPhone("876", "Samsung");

        List<SmartPhone> smartPhoneList = new ArrayList<>(6);
        smartPhoneList.add(s1);
        smartPhoneList.add(s2);
        smartPhoneList.add(s3);

        for (SmartPhone smartPhone : smartPhoneList){
            System.out.println(smartPhone);
        }

        SmartPhone s4 = new SmartPhone("87622", "ex");
        System.out.println(smartPhoneList.contains(s4));

        int indexSmart = smartPhoneList.indexOf(s3);
        System.out.println(indexSmart);

        System.out.println(smartPhoneList.get(indexSmart));

//        smartPhoneList.add(0, s4);
        System.out.println(smartPhoneList.indexOf(s4));



    }
}
