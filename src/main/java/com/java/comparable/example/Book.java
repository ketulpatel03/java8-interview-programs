package com.java.comparable.example;

public class Book implements Comparable<Book> {

    private String name;
    private int year;

    public Book(String name, int year) {
        this.name = name;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public int compareTo(Book book) {
        return Integer.compare(this.year, book.year);
    }

}
