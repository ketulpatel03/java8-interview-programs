package com.java.collections.framework;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

// ArrayList, LinkedList, Vector, Stack, CopyOnWriteArrayList
public class ListImplementation {

    public static void main(String[] args) {

        // ArrayList
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(2);
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(4);
        arrayList.add(null);
        arrayList.add(null);
        System.out.println("ArrayList implementation: " + arrayList);

        // LinkedList
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(2);
        linkedList.add(1);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(4);
        linkedList.add(null);
        linkedList.add(null);
        System.out.println("LinkedList implementation: " + linkedList);

        // Vector
        List<Integer> vector = new Vector<>();
        vector.add(2);
        vector.add(1);
        vector.add(3);
        vector.add(4);
        vector.add(4);
        vector.add(null);
        vector.add(null);
        System.out.println("Vector implementation: " + vector);

        // Stack
        List<Integer> stack = new Stack<>();
        stack.add(2);
        stack.add(1);
        stack.add(3);
        stack.add(4);
        stack.add(4);
        stack.add(null);
        stack.add(null);
        System.out.println("Stack implementation: " + stack);

        // CopyOnWriteArrayList
        List<Integer> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.add(2);
        copyOnWriteArrayList.add(1);
        copyOnWriteArrayList.add(3);
        copyOnWriteArrayList.add(4);
        copyOnWriteArrayList.add(4);
        copyOnWriteArrayList.add(null);
        copyOnWriteArrayList.add(null);
        System.out.println("CopyOnWriteArrayList implementation: " + copyOnWriteArrayList);

    }

}
