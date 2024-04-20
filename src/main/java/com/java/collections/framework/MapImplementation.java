package com.java.collections.framework;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

// HashMap, LinkedHashMap, TreeMap, ConcurrentHashMap, HashTable
public class MapImplementation {

    public static void main(String[] args) {

        // HashMap
        Map<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(1, 2);
        hashMap.put(3, 4);
        hashMap.put(2, 3);
        hashMap.put(4, 5);
        hashMap.put(4, 6);
        hashMap.put(null, null);
        hashMap.put(null, null);
        hashMap.put(7, null);
        hashMap.put(null, 8);
        System.out.println("HashMap implementation: " + hashMap);

        // LinkedHashMap
        Map<Integer, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1, 2);
        linkedHashMap.put(3, 4);
        linkedHashMap.put(2, 3);
        linkedHashMap.put(4, 5);
        linkedHashMap.put(4, 6);
        linkedHashMap.put(null, null);
        linkedHashMap.put(null, null);
        linkedHashMap.put(7, null);
        linkedHashMap.put(null, 8);
        System.out.println("LinkedHashMap implementation: " + linkedHashMap);

        // TreeMap
        SortedMap<Integer, Integer> treeMap = new TreeMap<>();
        treeMap.put(1, 2);
        treeMap.put(3, 4);
        treeMap.put(2, 3);
        treeMap.put(4, 5);
        treeMap.put(4, 6);
//        treeMap.put(null, null);
//        treeMap.put(null, null);
        treeMap.put(7, null);
//        treeMap.put(null, 8);
        System.out.println("TreeMap implementation: " + treeMap);

        // ConcurrentHashMap : thread-safe
        Map<Integer, Integer> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put(1, 2);
        concurrentHashMap.put(3, 4);
        concurrentHashMap.put(2, 3);
        concurrentHashMap.put(4, 5);
        concurrentHashMap.put(4, 6);
//        concurrentHashMap.put(null, null);
//        concurrentHashMap.put(null, null);
//        concurrentHashMap.put(7, null);
//        concurrentHashMap.put(null, 8);
        System.out.println("ConcurrentHashMap implementation: " + concurrentHashMap);

        // HashTable : it is synchronized
        Map<Integer, Integer> hashTable = new Hashtable<>();
        hashTable.put(1, 2);
        hashTable.put(3, 4);
        hashTable.put(2, 3);
        hashTable.put(4, 5);
        hashTable.put(4, 6);
//        hashTable.put(null, null);
//        hashTable.put(null, null);
//        hashTable.put(7, null);
//        hashTable.put(null, 8);
        System.out.println("HashTable implementation: " + hashTable);

    }

}
