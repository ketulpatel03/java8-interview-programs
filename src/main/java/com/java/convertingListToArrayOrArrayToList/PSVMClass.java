package com.java.convertingListToArrayOrArrayToList;

import java.util.Arrays;
import java.util.List;

public class PSVMClass {

    public static void main(String[] args) {

        // initializing an integer array way: 1
        Integer[] intArray1 = {2, 0, 7, 1, 3};
        List<Integer> list = Arrays.stream(intArray1).toList();
        System.out.println("intArray 1: " + Arrays.toString(intArray1));

        // initializing an integer array way: 2
        int[] intArray2 = new int[5];
        intArray2[0] = 2;
        intArray2[1] = 0;
        intArray2[2] = 7;
        intArray2[3] = 1;
        intArray2[4] = 3;
        System.out.println("intArray 2: " + Arrays.toString(intArray2));

        List<Integer> integerList = Arrays.asList(intArray1);
        System.out.println("printing List<Integer>1: " + integerList);

        Integer[] intArray3 = integerList.toArray(new Integer[0]);
        System.out.println(Arrays.toString(intArray3));

    }

}
