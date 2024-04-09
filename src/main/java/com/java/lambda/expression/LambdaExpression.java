package com.java.lambda.expression;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaExpression {

    public static boolean startsWithVocal(String str) {
        return str.startsWith("A") ||
                str.startsWith("E") ||
                str.startsWith("I") ||
                str.startsWith("O") ||
                str.startsWith("U");
    }

    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("Orange", "Apple", "Strawberry", "Banana");

        // using lambda expression / function
        System.out.println("using lambda expression / function");
        stringList.stream()
                .filter(str -> startsWithVocal(str))
                .map(str -> str.toUpperCase())
                .forEach(str -> System.out.println(str));

        // if above lambda expression / function we write using anonymous classes
        System.out.println("using anonymous classes");
        stringList.stream()
                .filter(new Predicate<String>() {
                    @Override
                    public boolean test(String s) {
                        return startsWithVocal(s);
                    }
                })
                .map(new Function<String, String>() {
                    @Override
                    public String apply(String s) {
                        return s.toUpperCase();
                    }
                })
                .forEach(new Consumer<String>() {
                    @Override
                    public void accept(String s) {
                        System.out.println(s);
                    }
                });
    }

}
