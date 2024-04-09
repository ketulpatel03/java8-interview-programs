package com.java.comparator.example;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<EmployeeComparator> {

    private String name;
    private int age;

    public EmployeeComparator() {
    }

    public EmployeeComparator(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compare(EmployeeComparator o1, EmployeeComparator o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
