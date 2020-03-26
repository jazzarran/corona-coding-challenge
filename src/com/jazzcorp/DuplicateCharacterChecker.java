package com.jazzcorp;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateCharacterChecker {

    public static void main(String[] args) {
        String input = "aabcdeefghijjklmnopqqrstuvxyzz";

        Map<String, Long> map = input.chars().mapToObj(x -> (char) x).collect(Collectors.groupingBy(Object::toString, Collectors.counting()));
        map.forEach((key, value) -> System.out.println(key + "|" + value));
    }
}
