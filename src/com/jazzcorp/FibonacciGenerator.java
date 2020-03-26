package com.jazzcorp;

import java.util.ArrayList;
import java.util.List;

public class FibonacciGenerator {

    public static void main(String[] args) {
        generateFibonacci(100);
    }

    public static void generateFibonacci(int max){
        List<Integer> list = new ArrayList<Integer>();
        list.add(0);
        list.add(1);

        for(int i=1; ; i++){
            int currentValue = list.get(i) + list.get(i-1);
            if(currentValue > max) break;
            list.add(currentValue);
        }

        list.stream().forEach(System.out::println);
    }
}
