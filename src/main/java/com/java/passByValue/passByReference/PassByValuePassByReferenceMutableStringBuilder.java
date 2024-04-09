package com.java.passByValue.passByReference;

public class PassByValuePassByReferenceMutableStringBuilder {

    public static void main(String[] args) {
        StringBuilder strBuilder = new StringBuilder("2");
        method1(strBuilder);
        System.out.println(strBuilder);
    }

    private static void method1(StringBuilder strBuilder) {
        strBuilder.append("-4");
    }

}
