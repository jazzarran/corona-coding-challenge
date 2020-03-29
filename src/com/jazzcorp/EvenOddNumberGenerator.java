package com.jazzcorp;

import com.sun.codemodel.internal.JGenerable;

import java.util.stream.Stream;

public class EvenOddNumberGenerator {

    public static void main(String[] args) {
        generateEvenNumbers(100);
        generateOddNumbers(100);
    }

    public static void generateEvenNumbers(int max){
        Stream.iterate(0, n -> n + 2).limit(100).forEach(System.out::println);
    }

    public static void generateOddNumbers(int max){
        Stream.iterate(1, n -> n + 2).limit(100).forEach(System.out::println);
    }
}
