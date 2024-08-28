package org.example.javacore.OException.runtime.test;

public class RuntimeExceptionTest03 {

    public static void main(String[] args) {
        abreConexao();
    }

    private static String abreConexao() {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
            return "Conexão aberta";
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            System.out.println("Fechando o recurso liberado pelo SO");
        }

        return null;
    }
}
