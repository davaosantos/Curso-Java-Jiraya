package org.example.javacore.YColecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(0);
        nums.add(4);
        nums.add(3);
        nums.add(6);

        //index 0, 1, 2, 3
        //value 2, 0, 4, 3


        Collections.sort(nums);
        System.out.println(nums);
        System.out.println("--------");
        System.out.println(Collections.binarySearch(nums,1));
    }
}
