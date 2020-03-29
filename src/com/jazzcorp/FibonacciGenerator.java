package com.jazzcorp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FibonacciGenerator {

    public static void main(String[] args) {
        generateFibonacci(10).forEach(System.out::println);
    }

    public static List<Integer> generateFibonacci(int max) {
        List<Integer> series = Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]}).limit(max).map(t -> t[0]).collect(Collectors.toList());
        return series;
    }
}
