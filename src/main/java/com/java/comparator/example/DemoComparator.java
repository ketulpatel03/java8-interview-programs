package com.java.comparator.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DemoComparator {

    public static void main(String[] args) {
        List<EmployeeComparator> employeeList = Arrays.asList(
                new EmployeeComparator("KP", 37),
                new EmployeeComparator("UP", 25),
                new EmployeeComparator("JT", 26)
        );

        Collections.sort(employeeList, new EmployeeComparator());

        System.out.println(employeeList);
    }

}
