package org.example.javacore.YColecoes.test;

import java.util.HashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        Map<String, String> mapStr = new HashMap<>();
        mapStr.put("teklado", "teclado");
        mapStr.put("mouze", "mouse");
        mapStr.put("vc", "você");
//        mapStr.put("vc", "você2");
        mapStr.putIfAbsent("vc", "você2");

        System.out.println(mapStr);

        System.out.println("------- VIA CHAVE --------");
        //Navegação via Chave
        for (String key : mapStr.keySet()){
            System.out.println(key + " : " + mapStr.get(key));
        }

        System.out.println("-------- VIA VALOR ------");
        for (String value : mapStr.values()){
            System.out.println(value);
        }

        System.out.println("---- VIA FOR -----");
        for (Map.Entry<String, String> entry : mapStr.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
