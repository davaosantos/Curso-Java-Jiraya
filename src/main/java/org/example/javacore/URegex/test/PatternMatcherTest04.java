package org.example.javacore.URegex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {

    // \d Todos os digitos
// \D Tudo que não for digito
// \s Espacos em branco \t \n \f \r
    // \S -> Todos os caracteres excluindo os brancos .
    public static void main(String[] args) {
        // ? Zero ou uma
// * Zero ou mais
// + Uma ou mais
// {n,m} de n até m
// () -> agrupamento
// | -> ou
// a(v|o)a -> ovo | oco
// $ -> fim da linha
        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String texto = "12 0x 0X 0xFFABC 0x10G 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto:   " + texto);
        System.out.println("Indice : 12345789");
        System.out.println("Regex " + regex);
        System.out.println("Posições encontradas");

        while (matcher.find()){
            System.out.println(matcher.start() + " " + matcher.group());
        }

    }
}
