package org.example.javacore.OException.runtime.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {

    public static void main(String[] args) {

        try {
            throw new ArrayIndexOutOfBoundsException();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Dentro do arrayExp");
        }catch (IndexOutOfBoundsException e){
            System.out.println("Dentro do index of bound");
        }catch (IllegalArgumentException e){
            System.out.println("Illegal exc");
        }catch (ArithmeticException ex){
            System.out.println("Aritim exc");
        }catch (RuntimeException ex){

        }

        try {
            talvezLanceException();
        } catch (Exception ex){}
    }

    private static void talvezLanceException() throws SQLException, FileNotFoundException{

    }
}
