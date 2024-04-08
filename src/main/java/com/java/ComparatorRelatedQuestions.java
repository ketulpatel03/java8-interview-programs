package com.java;

import com.java.model.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComparatorRelatedQuestions {

    public static void main(String[] args) {

        List<Employee> employeeList = Arrays.asList(
                new Employee(1, "ketul", "patel", "ahmedabad", "123", 35),
                new Employee(2, "umang", "patel", "ahmedabad", "789", 25),
                new Employee(3, "jay", "thakkar", "dholka", "456", 25),
                new Employee(4, "vivek", "vyas", "anand", "234", 24),
                new Employee(5, "rajat", "soni", "ahmedabad", "678", 27),
                new Employee(6, "mahesh", "vithani", "bhavnagar", "345", 35),
                new Employee(7, "vitthal", "agarwal", "dehradun", "567", 26),
                new Employee(8, "bhajan", "bishnoi", "ajmer", "345", 24),
                new Employee(9, "hitaxi", "patel", "ahmedabad", "678", 25));

        List<String> fruitList = Arrays.asList("orange", "banana", "grapes", "apple", "malta", "strawberry", null);

        // 1st
        fruitList.sort(Comparator.nullsFirst(Comparator.naturalOrder()));
        System.out.println(fruitList);

        // 2nd
        fruitList.sort(Comparator.nullsLast(Comparator.reverseOrder()));
        System.out.println(fruitList);

        //3rd
        employeeList.sort(Comparator.comparing(Employee::age).reversed());
        System.out.println(employeeList);

        // 4th
        employeeList.sort(Comparator.comparing(Employee::age).reversed()
                .thenComparing(Comparator.comparing(Employee::address))
                .thenComparing(Comparator.comparing(Employee::id)));
        System.out.println(employeeList);

        // 5th : using stream API
        List<Employee> list = employeeList.stream()
                .sorted(Comparator.comparing(Employee::age)
                        .thenComparing(Employee::firstName))
                .collect(Collectors.toList());
        System.out.println(list);

    }

}
