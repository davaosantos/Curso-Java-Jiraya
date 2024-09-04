package org.example.javacore.PWrappers.test;

import java.util.List;

public class WrapperTest01 {

    public static void main(String[] args) {
        byte byteP = 1;
        short shortP = 1;
        int intP = 1 ;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 100D;
        char charP = 'W';
        boolean booleanP = false;

        /*WRAPPERS*/
        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1; // auto boxing
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 100D;
        Character charW = 'W';
        Boolean booleanW = false;

//        List<int> list;
//        List<Integer> listI;

        Integer intW2 = Integer.parseInt("1");
        boolean bol = Boolean.parseBoolean("true");
        System.out.println(bol);

        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isLetterOrDigit('!'));
        System.out.println(Character.isUpperCase('!'));
        System.out.println(Character.isLowerCase('!'));
        System.out.println(Character.toLowerCase('!'));
        System.out.println(Character.toUpperCase('!'));
    }
}
