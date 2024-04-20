package com.java.collections.framework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;

// HashSet, LinkedHashSet, TreeSet, CopyOnWriteArraySet
public class SetImplementation {

    public static void main(String[] args) {

        // HashSet
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(2);
        hashSet.add(1);
        hashSet.add(3);
        hashSet.add(4);
        hashSet.add(4);
        hashSet.add(null);
        hashSet.add(null);
        System.out.println("HashSet implementation: " + hashSet);

        // LinkedHashSet
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(2);
        linkedHashSet.add(1);
        linkedHashSet.add(3);
        linkedHashSet.add(4);
        linkedHashSet.add(4);
        linkedHashSet.add(null);
        linkedHashSet.add(null);
        System.out.println("LinkedHashSet implementation: " + linkedHashSet);

        // TreeSet
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(2);
        treeSet.add(1);
        treeSet.add(3);
        treeSet.add(4);
        treeSet.add(4);
//        treeSet.add(null);
//        treeSet.add(null);
        System.out.println("TreeSet implementation: " + treeSet);

        // CopyOnWriteArraySet
        Set<Integer> copyOnWriteArraySet = new CopyOnWriteArraySet<>();
        copyOnWriteArraySet.add(2);
        copyOnWriteArraySet.add(1);
        copyOnWriteArraySet.add(3);
        copyOnWriteArraySet.add(4);
        copyOnWriteArraySet.add(4);
        copyOnWriteArraySet.add(null);
        copyOnWriteArraySet.add(null);
        System.out.println("CopyOnWriteArraySet implementation: " + copyOnWriteArraySet);
    }

}
