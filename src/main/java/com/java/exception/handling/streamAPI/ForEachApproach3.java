package com.java.exception.handling.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachApproach3 {

    public static void main(String[] args) {
        // scenario 1
        List<Integer> integerList = Arrays.asList(2, 1, 0, 5);
        integerList.stream().forEach(consumerWrapper(e -> System.out.println(50 / e), ArithmeticException.class));

        // scenario 2
        List<String> stringList = Arrays.asList("12", "23", "34", "xy");
        stringList.stream().forEach(consumerWrapper(e -> System.out.println(Integer.parseInt(e)), NumberFormatException.class));
    }

    private static <T, E extends Exception> Consumer<T> consumerWrapper(Consumer<T> consumer, Class<E> clazz) {
        return i -> {
            try {
                consumer.accept(i);
            } catch (Exception ex) {
                try {
                    E exCast = clazz.cast(ex);
                    System.out.println("exception: " + exCast.getMessage());
                } catch (ClassCastException ccEx) {
                    throw ex;
                }
            }
        };
    }
}
