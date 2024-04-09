package com.java.passByValue.passByReference;

public class PassByValuePassByReferenceImmutableString {

    public static void main(String[] args) {
        String str = "2";
        method1(str);
        System.out.println(str);
    }

    private static void method1(String str) {
        str = "3";
    }

}
