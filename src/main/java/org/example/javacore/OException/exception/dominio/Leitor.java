package org.example.javacore.OException.exception.dominio;

import java.io.Closeable;
import java.io.IOException;

public class Leitor implements Closeable {
    @Override
    public void close() throws IOException {
        System.out.println("Fechando leitor 1");
    }
}
