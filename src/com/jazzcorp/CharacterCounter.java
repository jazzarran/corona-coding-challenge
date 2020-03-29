package com.jazzcorp;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CharacterCounter {

    public static void main(String[] args) {
        String input = "aabcdeefghijjklmnopqqrstuvxyzz";
        Map<String, Long> map = Arrays.asList(input).stream().map(s -> s.split("")).flatMap(Arrays::stream).collect(Collectors.groupingBy(Object::toString, Collectors.counting()));
        map.forEach((key, value) -> System.out.println(key + "|" + value));
    }
}
