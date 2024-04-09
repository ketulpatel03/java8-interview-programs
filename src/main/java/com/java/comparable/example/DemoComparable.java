package com.java.comparable.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DemoComparable {

    public static void main(String[] args) {

        List<Book> bookList = Arrays.asList(
                new Book("A", 1997),
                new Book("C", 2013),
                new Book("K", 2024)
        );

        Collections.sort(bookList);

        System.out.println(bookList);

    }

}
