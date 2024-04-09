package com.java.anonymousClass;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;

public class AnonymousClassExample {

    public static void main(String[] args) {

        SomeInterface anonymousClass = new SomeInterface() {
            @Override
            public void doSomethingWithThis(String str) {
                System.out.println("printed by SomeInterface: " + str);
            }
        };
        anonymousClass.doSomethingWithThis("KETUL : anonymous class");

        // using lambda expression
        SomeInterface someInterface = str -> System.out.println(str);

        someInterface.doSomethingWithThis("KETUL : using lambda expression");
    }

}
