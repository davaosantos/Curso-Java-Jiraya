package org.example.javacore.MInterfaces.dominio;

public interface DataLoader {

    public static final int MAX_DATA_SIZE = 10;
    public abstract void load();

    default void checkPermission(){
        System.out.println("Fazendo checkagem de permissoes");
    }

    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do dataLoader");
    }

}
