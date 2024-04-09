package com.java.passByValue.passByReference;

public class PassByValuePassByReferencePrimitiveInt {

    public static void main(String[] args) {
        int value = 2;
        method1(value);
        System.out.println(value);
    }

    private static void method1(int value) {
        value = 3;
    }
}
