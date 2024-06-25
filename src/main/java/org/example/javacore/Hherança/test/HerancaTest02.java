package org.example.javacore.Hherança.test;

import org.example.javacore.Hherança.dominio.Funcionario;

public class HerancaTest02 {

    //0 - Bloco de inicialização estático da SUPERCLASSE é executado quando a JVM carregar a classe PAI
    //1 - Bloco de inicialização estático da SUBCLASSE é executado quando a JVM carregar a classe FILHA
    //2 - Alocado espaço em memória para o objeto da classe SUPERCLASSE
    //3 - Cada atributo de classe PAI é criado e inicializado com valores DEFAULT , ou o que for passado DA CLASSE PAI
    //4- Bloco de inicialização da SUPERCLASSE é executado na ordem em que aparece
    //5- Construtor é executado da superclasse

    //2 - Alocado espaço em memória para o objeto da classe SUBCLASSE
    //3 - Cada atributo de classe SUBCLASSE é criado e inicializado com valores DEFAULT , ou o que for passado DA SUBCLASSE
    //4- Bloco de inicialização da SUBCLASSE é executado na ordem em que aparece
    //5- Construtor é executado da SUBCLASSE
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("David");

    }
}
