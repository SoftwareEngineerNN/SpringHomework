package com.deadpool.harman.stream_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> collection = new ArrayList<>();
        collection.add(54);
        collection.add(53);
        collection.add(52);
        collection.add(51);
        collection.add(50);
        collection.add(49);

        int[] arr = {10,5,1,23,5};

        Stream.of(arr);

        List<Integer> arrList = Arrays.stream(arr)
                .filter(i->i >5)
                .boxed()
                .collect(Collectors.toList());


        List<Integer> oddSum = collection.stream()
                .filter(i->i%2!=0)
                .collect(Collectors.toList());
        System.out.println(oddSum);
    }
}
