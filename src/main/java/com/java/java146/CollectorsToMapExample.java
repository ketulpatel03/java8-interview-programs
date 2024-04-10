package com.java.java146;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsToMapExample {

    public static void main(String[] args) {

        // stream.of for list of integer
        List<Integer> intList = Stream.of(3, 2, 1, 4, 7, 5)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(intList);

        // stream.of for list of string
        List<String> fruitList = Stream.of("orange", "banana", "strawberry", "apple", "grapes")
                .sorted()
                .collect(Collectors.toList());
        System.out.println(fruitList);

        // stream.of for map of string
        Map<Integer, String> map = Stream.of("1", "11", "22", "111")
                .collect(Collectors.toMap(
                        s -> s.length(),
                        s -> s,
                        (s1, s2) -> s1 + s2
                ));
        System.out.println(map);

    }

}
