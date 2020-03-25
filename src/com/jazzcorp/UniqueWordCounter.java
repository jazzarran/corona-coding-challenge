package com.jazzcorp;

import java.util.HashMap;
import java.util.stream.*;

public class UniqueWordCounter {

    public static void main(String[] args) {
        HashMap<String, Integer> result = myWordCounter("the brown fox jumped over the lazy fox and dog");

        result.forEach((k, v) -> System.out.println((k + ":" + v)));
    }

    public static HashMap<String, Integer> myWordCounter(String input){
        String[] s = input.split(" ");
        HashMap<String, Integer> tracker = new HashMap<String, Integer>();

        for (String value: s) {
            Integer count = tracker.get(value);
            if(count != null){
                count = ++count;
                tracker.put(value, count);
            } else {
                tracker.put(value, 1);
            }
        }

        return tracker;
    }
}
