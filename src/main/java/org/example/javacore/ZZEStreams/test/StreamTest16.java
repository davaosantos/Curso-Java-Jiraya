package org.example.javacore.ZZEStreams.test;

import org.example.javacore.ZZEStreams.dominio.Category;
import org.example.javacore.ZZEStreams.dominio.LightNovel;
import org.example.javacore.ZZEStreams.dominio.Promotion;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;
import static org.example.javacore.ZZEStreams.dominio.Promotion.NORMAL_PRICE;
import static org.example.javacore.ZZEStreams.dominio.Promotion.UNDER_PROMOTION;

public class StreamTest16 {

    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        long num = 10_000_000_0;
        sumFor(num);
        sumForStreamIterate(num);
        sumParallelStreamIterate(num);
        sumParallelLongStream(num);
        sumParallelLongStreamParallel(num);
    }

    private static void sumFor(long num){
        System.out.println("Sum for");
        long result = 0;
        long init = System.currentTimeMillis();

        for (long i =1 ; i <= num ; i++){
            result += i;
        }
        long end = System.currentTimeMillis();

        System.out.println(result + " " + (end-init) + "ms");
    }

    private static void sumForStreamIterate(long num){
        System.out.println("Sum StreamIterate");
        long init = System.currentTimeMillis();

        long result = Stream.iterate(1L, i -> i+1).limit(num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();

        System.out.println(result + " " + (end-init) + "ms");
    }

    //[1,2,3,4,5,6,7,8,9,0] -> Com uma Thread , faz a soma individualmente .

    //1 - 1-5
    //2 - 6-0
    private static void sumParallelStreamIterate(long num){
        System.out.println("Sum ParalellalStream");
        long init = System.currentTimeMillis();

        long result = Stream.iterate(1L, i -> i+1).parallel().limit(num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();

        System.out.println(result + " " + (end-init) + "ms");
    }

    private static void sumParallelLongStream(long num){
        System.out.println("Sum Long Stream ");
        long init = System.currentTimeMillis();

        long result = LongStream.rangeClosed(1L, num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();

        System.out.println(result + " " + (end-init) + "ms");
    }

    private static void sumParallelLongStreamParallel(long num){
        System.out.println("Sum Long Stream Parallel");
        long init = System.currentTimeMillis();

        long result = LongStream.rangeClosed(1L, num).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();

        System.out.println(result + " " + (end-init) + "ms");
    }
}
