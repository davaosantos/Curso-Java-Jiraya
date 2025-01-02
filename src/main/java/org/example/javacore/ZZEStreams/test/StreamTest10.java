package org.example.javacore.ZZEStreams.test;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

public class StreamTest10 {

    public static void main(String[] args) {
//        Stream.iterate(1, n -> n + 2)
//                .limit(10)
//                .forEach(System.out::println);

        // FIBONACCI -> 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
        // (0,1) (1,1) (1,2) (2,3) (3,5) (5,8) (8,13) (13, 21) (21,34)
        //  0      1     2     3     4     5      6      7       8

        System.out.println("Todas as posições do array");
        Stream.iterate(new int[]{0,1}, n -> new int[]{n[1], n[0] + n[1]})
                .limit(10)
                .forEach(a -> System.out.print(Arrays.toString(a) + " "));

        System.out.println();
        System.out.println("Valores individuais de cada posição do array");
        Stream.iterate(new int[]{0,1}, n -> new int[]{n[1], n[0] + n[1]})
                .limit(10)
                .map(a -> a[0])
                .forEach(System.out::println);

        ThreadLocalRandom random = ThreadLocalRandom.current();
        Stream.generate(() -> random.nextInt(1, 500))
                .limit(90)
                .forEach(System.out::println);
    }
}
