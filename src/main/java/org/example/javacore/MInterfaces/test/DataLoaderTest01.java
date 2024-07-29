package org.example.javacore.MInterfaces.test;

import org.example.javacore.MInterfaces.dominio.DataLoader;
import org.example.javacore.MInterfaces.dominio.DatabaseLoader;
import org.example.javacore.MInterfaces.dominio.FileLoader;

public class DataLoaderTest01 {

    public static void main(String[] args) {
        DatabaseLoader databaseLoade = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();

        databaseLoade.load();
        fileLoader.load();

        databaseLoade.remove();
        fileLoader.remove();

        databaseLoade.checkPermission();
        fileLoader.checkPermission();

        DatabaseLoader.retrieveMaxDataSize();
        DataLoader.retrieveMaxDataSize();


    }
}
