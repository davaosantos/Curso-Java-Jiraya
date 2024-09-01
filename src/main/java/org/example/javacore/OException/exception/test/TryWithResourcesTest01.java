package org.example.javacore.OException.exception.test;

import org.example.javacore.OException.exception.dominio.Leitor;
import org.example.javacore.OException.exception.dominio.Leitor2;

import java.io.*;

public class TryWithResourcesTest01 {

    public static void main(String[] args) throws IOException {
        lerArquivo();
    }

    public static void lerArquivo() throws FileNotFoundException, IOException {

        try(Leitor leitor = new Leitor(); Leitor2 leitor2 = new Leitor2()) {

        }catch (IOException ex){}
    }

    public static void lerArquivo2(){
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                if (reader != null){
                    reader.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
