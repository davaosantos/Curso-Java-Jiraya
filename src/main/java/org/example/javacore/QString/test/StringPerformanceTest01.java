package org.example.javacore.QString.test;

public class StringPerformanceTest01 {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();

        concatString(100000);

        long fim = System.currentTimeMillis();

        System.out.println("Tempo gasto para a String sem String Builder " + (fim - inicio) + " em MS");

        long inicioBuilder = System.currentTimeMillis();

        concatStringBuilder(100000);

        long fimBuilder = System.currentTimeMillis();

        System.out.println("Tempo gasto para a String USANDO STRING BUILDER " + (fimBuilder - inicioBuilder) + " em MS");

        long inicioBuffer = System.currentTimeMillis();

        concatStringBuffer(100000);

        long fimBuffer = System.currentTimeMillis();

        System.out.println("Tempo gasto para a String USANDO STRING BUFFER " + (fimBuffer - inicioBuffer) + " em MS");
    };

    private static void concatString(int tamanho){
        String texto = "";

        for (int i = 0; i < tamanho; i++){
            texto += i; // 0 , 01, 012 , 013
        }
    };

    private static void concatStringBuilder(int tamanho){
        StringBuilder sb = new StringBuilder(tamanho);

        for (int i = 0; i < tamanho; i++){
            sb.append(i);
        }
    };

    private static void concatStringBuffer(int tamanho){
        StringBuffer sb = new StringBuffer(tamanho);

        for (int i = 0; i < tamanho; i++){
            sb.append(i);
        }
    };
}
