package com.java.playground.Practice22052024;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class PrimitiveDataTypeStreamAPIMainClass {

    public static void main(String[] args) {

        // strList
        List<String> strList = Arrays.asList("hi", "please", "bye", "yes", "good");

        System.out.println("..... String list : start.....");

        // as is
        System.out.println(strList);

        System.out.println("ascending order: ");
        strList.stream().sorted().forEach(System.out::println);

        System.out.println("descending order: ");
        strList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        System.out.println("based on str length sorting: ");
        strList.stream().sorted(Comparator.comparingInt(String::length)).forEach(System.out::println);

        // occurance of a character in all the strings
        List<String> strings = Arrays.asList("apple", "banana", "orange",
                "grape", "melon");
        char target = 'a';
        long occurrences = strings.stream()
                .flatMapToInt(CharSequence::chars)
                .filter(c -> c == target)
                .count();
        System.out.println("Occurrences of '" + target + "': " + occurrences);

        System.out.println("..... String list : end.....");
        // strList

        // intList
        List<Integer> intList = Arrays.asList(3, 1, 4, 5, 9, 7, 2);

        System.out.println("..... Integer list : start.....");

        // as is
        System.out.println(intList);

        System.out.println("ascending order: ");
        intList.stream().sorted().forEach(System.out::println);

        System.out.println("descending order: ");
        intList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        System.out.println("..... Integer list : end.....");
    }

}
