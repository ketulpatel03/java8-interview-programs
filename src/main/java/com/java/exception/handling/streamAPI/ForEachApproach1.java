package com.java.exception.handling.streamAPI;

import java.util.Arrays;
import java.util.List;

public class ForEachApproach1 {

    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(2, 1, 0, 5);

        intList.stream().forEach(e -> {
            try {
                System.out.println(50 / e);
            } catch (Exception ex) {
                System.out.println("exception: " + ex.getMessage());
            }
        });

    }

}
