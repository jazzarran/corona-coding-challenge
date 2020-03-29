package com.jazzcorp;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WordCounter {

    public static void main(String[] args) {
        //HashMap<String, Integer> result1 = myWordCounter("the brown fox jumped over the lazy fox and dog");
        //result1.forEach((k, v) -> System.out.println((k + ":" + v)));

        Map<String, Long> result2 = streamsWordCounter("the brown fox jumped over the lazy fox and dog");
        result2.forEach((k, v) -> System.out.println((k + ":" + v)));
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

    public static Map<String, Long> streamsWordCounter(String input) {
        Map<String, Long> map = Arrays.asList(input.split(" ")).stream().collect(Collectors.groupingBy(Object::toString, Collectors.counting()));
        return map;
    }
}
