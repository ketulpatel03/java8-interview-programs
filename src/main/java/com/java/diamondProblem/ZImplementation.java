package com.java.diamondProblem;

public class ZImplementation implements XInterface, YInterface {

    @Override
    public void method1() {
        XInterface.super.method1();
        YInterface.super.method1();
        System.out.println("this is implementation Z");
    }

    public static void main(String[] args) {
        ZImplementation z = new ZImplementation();
        z.method1();
    }

}
