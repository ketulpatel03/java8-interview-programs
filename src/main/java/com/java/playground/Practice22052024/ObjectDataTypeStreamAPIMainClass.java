package com.java.playground.Practice22052024;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ObjectDataTypeStreamAPIMainClass {

    public static void main(String[] args) {

        List<Employee> employeeList = Stream.of(
                new Employee("ashish", 36, "lead", "software engineering", 3600000),
                new Employee("abhishek", 28, "lead", "software engineering", 2800000),
                new Employee("kamna", 29, "ba", "business", 1800000),
                new Employee("dhwani", 28, "product owner", "business", 2900000),
                new Employee("mihir", 38, "product owner", "business", 3800000),
                new Employee("umang", 25, "developer", "software engineering", 1600000),
                new Employee("vivek", 25, "developer", "software engineering", 1700000),
                new Employee("ketul", 37, "lead", "software engineering", 2800000),
                new Employee("parth", 32, "ba", "business", 1200000)
        ).collect(Collectors.toList());

        // as is
        System.out.println(employeeList);

        // sorted based on age
        System.out.println("sorted based on age: ");
        employeeList.stream().sorted(Comparator.comparing(Employee::getAge)).forEach(System.out::println);

        // sorted based on age and salary
        System.out.println("sorted based on age and salary: ");
        employeeList
                .stream()
                .sorted(Comparator.comparing(Employee::getAge).thenComparingLong(Employee::getSalary))
                .forEach(System.out::println);

        // get max salary from each department
        Map<String, Optional<Employee>> map1 = employeeList
                .stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
        System.out.println("department wise max salary employee: " + map1);
    }

}
