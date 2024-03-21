package com.java;

import com.java.model.Student;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIAndFunctions {

    private static List<Student> students = Stream.of(
            new Student(1, "one", 25, "male", "CE", "nadiad", 11, Arrays.asList("1234567890")),
            new Student(2, "two", 24, "female", "IT", "baroda", 27, Arrays.asList("1234567890", "0987654321")),
            new Student(3, "three", 27, "male", "IT", "ahmedabad", 65, Arrays.asList("1234567890", "0987654321")),
            new Student(4, "four", 29, "female", "EC", "navsari", 77, Arrays.asList("1234567890", "0987654321")),
            new Student(5, "five", 28, "female", "IC", "baroda", 03, Arrays.asList("1234567890", "0987654321")),
            new Student(6, "six", 26, "male", "CE", "ahmedabad", 45, Arrays.asList("1234567890", "0987654321")),
            new Student(7, "seven", 25, "female", "IT", "nadiad", 51, Arrays.asList("1234567890", "0987654321")),
            new Student(8, "eight", 22, "male", "CE", "rajkot", 76, Arrays.asList("1234567890", "0987654321")),
            new Student(9, "nine", 23, "male", "IC", "morbi", 98, Arrays.asList("1234567890", "0987654321")),
            new Student(10, "ten", 24, "female", "IT", "jamnagar", 21, Arrays.asList("1234567890", "0987654321")),
            new Student(11, "eleven", 29, "male", "CIVIL", "porbandar", 59, Arrays.asList("1234567890", "0987654321")),
            new Student(12, "twelve", 26, "male", "EC", "gandevi", 78, Arrays.asList("1234567890", "0987654321"))
    ).collect(Collectors.toList());

    public static void main(String[] args) {

        // 1: filter students between the rank 50 to 100
        List<Student> filteredStudents1 = students.stream().filter(e -> e.rank() >= 50 && e.rank() <= 100)
                .collect(Collectors.toList());
        System.out.println("1: filter students between the rank 50 to 100");
        System.out.println(filteredStudents1);

        // 2: find students who stay in "nadiad" and sort reverse by firstName
        List<Student> filteredStudents2 = students.stream().filter(e -> e.city().equals("nadiad"))
                .sorted(Comparator.comparing(Student::firstName, Comparator.reverseOrder()))
                .collect(Collectors.toList());
        System.out.println("2: find students who stay in \"nadiad\" and sort reverse by firstName");
        System.out.println(filteredStudents2);

        // 3: find all distinct department names using distinct
        List<String> filteredStudents3 = students.stream().map(e -> e.department())
                .distinct()
                .collect(Collectors.toList());
        System.out.println("3: find all distinct department names using distinct");
        System.out.println(filteredStudents3);

        // 3: find all distinct department names using set
        Set<String> filteredStudents4 = students.stream().map(e -> e.department()).collect(Collectors.toSet());
        System.out.println("3: find all distinct department names using set");
        System.out.println(filteredStudents4);

        // 4: find all the contact numbers of all the students
        // oneToOne : use map
        // oneToMany : use flatMap
        List<String> filteredStudents5 = students.stream().flatMap(e -> e.contacts().stream()).collect(Collectors.toList());
        System.out.println("4: find all the contact numbers of all the students");
        System.out.println(filteredStudents5);

        // 5: group the students by department
        Map<String, List<Student>> filteredStudents6 = students.stream().collect(Collectors.groupingBy(e -> e.department()));
        System.out.println("5: group the students by department");
        System.out.println(filteredStudents6);

        // 6: group the students by department with count
        Map<String, Long> filteredStudents7 = students.stream()
                .collect(Collectors.groupingBy(e -> e.department(), Collectors.counting()));
        System.out.println("6: group the students by department with count");
        System.out.println(filteredStudents7);

        // 7: find department having max student count
        Map.Entry<String, Long> filteredStudents8 = students.stream()
                .collect(Collectors.groupingBy(e -> e.department(), Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue()).get();
        System.out.println("7: find department having max student count");
        System.out.println(filteredStudents8);

        // 8: find average age of male and female
        Map<String, Double> filteredStudents9 = students.stream()
                .collect(Collectors.groupingBy(e -> e.gender(),
                        Collectors.averagingInt(e -> e.age())));
        System.out.println("8: find average age of male and female");
        System.out.println(filteredStudents9);

        // 9: find highest rank in each department
        Map<String, Optional<Student>> filteredStudents10 = students.stream()
                .collect(Collectors.groupingBy(e -> e.department(),
                        Collectors.minBy(Comparator.comparing(e -> e.rank()))));
        System.out.println("9: find highest rank in each department");
        System.out.println(filteredStudents10);

        // 10: find student who is second-highest rank
        Optional<Student> filteredStudents11 = students.stream()
                .sorted(Comparator.comparing(e -> e.rank()))
                .skip(1)
                .findFirst();
        System.out.println("10: find student who is second-highest rank");
        System.out.println(filteredStudents11.get());
    }

}
