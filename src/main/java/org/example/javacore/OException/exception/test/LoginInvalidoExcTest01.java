package org.example.javacore.OException.exception.test;

import org.example.javacore.OException.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExcTest01 {
    public static void main(String[] args)  {
        try {
            logar();
        } catch (LoginInvalidoException e) {
           e.printStackTrace();
        }
    }
    private static void logar() throws LoginInvalidoException {
        Scanner teclado = new Scanner(System.in);
        String usernameDB = "Goku";
        String senhaDB = "SSJ";

        System.out.println("Usuario");
        String userNameDig = teclado.nextLine();

        System.out.println("Senha");
        String senhaDig = teclado.nextLine();

        if (!usernameDB.equals(userNameDig) || !senhaDB.equals(senhaDig)){
            throw new LoginInvalidoException("Usuario ou senha invalidos");
        }

        System.out.println("Usuario logado com sucesso");
    }
}
