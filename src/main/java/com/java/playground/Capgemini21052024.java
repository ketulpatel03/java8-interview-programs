package com.java.playground;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Capgemini21052024 {

    public static void main(String[] args) {

        // questions asked by Rajesh N. Kumar
        // 1. stream API example and write code: 1. sorting, 2. comparing 2 int list, 3. find 2nd largest int, 4. filters
        // 2. HashMap vs HashTable
        // 3. Microservices vs Monolith
        // 4. Java 8 features
        // 5. Apache Kafka: partitions
        // 6. Java 8: different method reference
        // 7. Java 8: Optional class
        // 8. Angular design patterns

        List<Student> studentList = Stream.of(
                new Student("ketul", "patel", "IT", 67, Arrays.asList(1, 2)),
                new Student("ravi", "davda", "IT", 14, Arrays.asList(3, 4)),
                new Student("ankit", "shah", "EC", 76, Arrays.asList(5, 6)),
                new Student("vishal", "patel", "EC", 63, Arrays.asList(7, 8)),
                new Student("ravi", "patel", "EC", 65, Arrays.asList(9, 10)),
                new Student("jay", "patel", "CE", 59, Arrays.asList(11, 12)),
                new Student("brijen", "rao", "IT", 13, Arrays.asList(13, 14)),
                new Student("nirav", "sahayta", "CE", 87, Arrays.asList(15, 16))
        ).collect(Collectors.toList());

        List<Integer> unsortedIntList1 = Arrays.asList(6, 1, 2, 7, 5, 9);

        List<String> unsortedStringList1 = Arrays.asList("ok", "apple", "bye", "good", "orange", "say", "please");

        List<Integer> list1 = Arrays.asList(2, 3, 5, 7, 8, 9);
        List<Integer> list2 = Arrays.asList(2, 3, 4, 5, 7, 9);

        // me
        System.out.println("me 1: ");
        list1.stream().filter(e -> list2.contains(e)).forEach(System.out::println);
        // rajesh kumar
        System.out.println("rajesh 1: ");
        // list1.stream().filter(list2::contains).(System::out::println)
        list1.stream().filter(list2::contains).forEach(System.out::println);

        // me
        System.out.println("me 2: ");
        Optional<Integer> first = unsortedIntList1.stream().sorted().skip(1).findFirst();
        if (first.isPresent()) {
            System.out.println(first.get());
        }

        // me
        System.out.println("me 3: ");
        List<Student> collect = studentList
                                    .stream()
                                    .sorted(Comparator.comparing(Student::getDepartment).thenComparing(Student::getRank))
                                    .collect(Collectors.toList());
        System.out.println(collect);

        // me
        System.out.println("me 4: ");
        unsortedStringList1.stream().sorted().forEach(System.out::println);
//        unsortedStringList1.sort(Comparator.reverseOrder());
        System.out.println("changed: " + unsortedStringList1);

        // me
        System.out.println("me 5: ");
        IntSummaryStatistics collect1 = studentList.stream().collect(Collectors.summarizingInt(Student::getRank));
        System.out.println(collect1.getSum());
        System.out.println(collect1.getMax());

    }


}
