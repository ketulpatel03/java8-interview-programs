package com.java.exception.handling.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachApproach2 {

    public static void main(String[] args) {

        List<String> strList = Arrays.asList("12", "23", "34", "xy");
        strList.stream().forEach(lambdaWrapper(e -> System.out.println(Integer.parseInt(e))));

    }

    private static Consumer<String> lambdaWrapper(Consumer<String> consumer) {
        return e -> {
            try {
                consumer.accept(e);
            } catch (Exception ex) {
                System.out.println("exception: " + ex.getMessage());
            }
        };
    }

}
