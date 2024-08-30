package org.example.javacore.OException.runtime.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {

    public static void main(String[] args) throws SQLException, FileNotFoundException {

        try {
            throw new ArrayIndexOutOfBoundsException();
        }catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException  e){
            System.out.println("Dentro do arrayExp");
        }catch (IndexOutOfBoundsException e){
            System.out.println("Dentro do index of bound");
        }catch (RuntimeException ex){

        }

        try {
            talvezLanceException();
        } catch (SQLException e){

        } catch (FileNotFoundException e){
            
        }
    }

    private static void talvezLanceException() throws SQLException, FileNotFoundException{

    }
}
