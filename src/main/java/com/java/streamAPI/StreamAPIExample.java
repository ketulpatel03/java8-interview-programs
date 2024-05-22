package com.java.streamAPI;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIExample {

    public static void main(String[] args) {

        List<String> nameList = Arrays.asList("John", "Alice", "Bob", "Jane");

        List<Integer> intList = Arrays.asList(2, 1, 5, 3, 8, 6, 9);

        List<Student> studentList = Arrays.asList(
                new Student("ketul", "IT", 67),
                new Student("jay", "CE", 81),
                new Student("brijen", "IT", 54),
                new Student("ravi", "IT", 75),
                new Student("vishal", "EC", 84),
                new Student("manish", "EC", 87),
                new Student("ravi bhua", "IC", 91),
                new Student("sunny", "IT", 60),
                new Student("viral", "CE", 89)
        );

        // concatenate using Collectors.joining
        String concatenatedNames = nameList.stream()
                .collect(Collectors.joining(", "));
        System.out.println("concatenated names: " + concatenatedNames);

        List<Integer> sortedIntList = intList.stream().sorted().collect(Collectors.toList());
        System.out.println("sorted int list: " + sortedIntList);

        IntSummaryStatistics intSummaryStatistics = intList.stream().sorted().collect(Collectors.summarizingInt(Integer::intValue));
        System.out.println("get max int: " + intSummaryStatistics.getMax());
        System.out.println("get min int: " + intSummaryStatistics.getMin());
        System.out.println("get avg of int: " + intSummaryStatistics.getAverage());
        System.out.println("get sum of int: " + intSummaryStatistics.getSum());
        System.out.println("get count of int: " + intSummaryStatistics.getCount());

        // groupingBy department getting the 1st highest marks holder
        Map<String, Optional<Student>> departmantwiseMaxMarks = studentList
                .stream()
                .collect(Collectors.groupingBy(e -> e.getDepartment(), Collectors.maxBy(Comparator.comparing(e -> e.getMarks()))));
        System.out.println("departmentwise max marks: " + departmantwiseMaxMarks);

        LongSummaryStatistics longSummaryStatistics = studentList.stream().collect(Collectors.summarizingLong(Student::getMarks));
        System.out.println("max from all students: " + longSummaryStatistics.getMax());
        System.out.println("min from all students: " + longSummaryStatistics.getMin());

        Map<String, Double> departmentwiseAvgMarks = studentList.stream()
                                                        .collect(Collectors.groupingBy(e -> e.getDepartment(),
                                                                                       Collectors.averagingInt(Student::getMarks)));
        System.out.println("departmentwise average marks: " + departmentwiseAvgMarks);

        List<String> list1 = Arrays.asList("apple", "banana", "orange");
        List<String> list2 = Arrays.asList("grape", "melon", "pineapple");

        Stream<String> stream1 = list1.stream();
        Stream<String> stream2 = list2.stream();

        Stream<String> concatenatedStream = Stream.concat(stream1, stream2);
        System.out.println("printing concatenated stream: ");
        concatenatedStream.forEach(System.out::println);

        List<String> strings = Arrays.asList("apple", "banana", "orange",
                "grape", "melon");
        char target = 'a';
        long occurrences = strings.stream()
                .flatMapToInt(CharSequence::chars)
                .filter(c -> c == target)
                .count();
        System.out.println("Occurrences of '" + target + "': " + occurrences);

//        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10);
//        int target = 12;
//        Set<String> pairs = numbers.stream()
//                .flatMap(i -> numbers.stream().
//                        map(j -> i + j == target ? "(" + i + ", " + j + ")" : ""))
//                .filter(s -> !s.isEmpty())
//                .collect(Collectors.toSet());
//        System.out.println("Pairs that sum up to " + target + ": " + pairs);

    }

}
