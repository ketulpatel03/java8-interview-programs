package com.java.tellTheOutput.callConstructorWithNull;

class A {

    String i, j;

    A(String i, String j) {
        this.i = i;
        this.j = j;
    }

}

public class PSVMClass {

    public static void main(String[] args) {

        final A a = new A(null, null);

        System.out.println("A.i: " + a.i + " | A.j: " + a.j);

    }

}
