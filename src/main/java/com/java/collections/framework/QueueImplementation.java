package com.java.collections.framework;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;

// PriorityQueue, ConcurrentLinkedQueue, ArrayDeque, ConcurrentLinkedDeque
public class QueueImplementation {

    public static void main(String[] args) {

        // PriorityQueue
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(2);
        priorityQueue.add(1);
        priorityQueue.add(3);
        priorityQueue.add(4);
        priorityQueue.add(4);
//        priorityQueue.add(null);
//        priorityQueue.add(null);
        System.out.println("PriorityQueue implementation: " + priorityQueue);

        // ConcurrentLinkedQueue
        Queue<Integer> concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
        concurrentLinkedQueue.add(2);
        concurrentLinkedQueue.add(1);
        concurrentLinkedQueue.add(3);
        concurrentLinkedQueue.add(4);
        concurrentLinkedQueue.add(4);
//        concurrentLinkedQueue.add(null);
//        concurrentLinkedQueue.add(null);
        System.out.println("ConcurrentLinkedQueue implementation: " + concurrentLinkedQueue);

        // ArrayDeque
        Deque<Integer> arrayQueue = new ArrayDeque<>();
        arrayQueue.add(2);
        arrayQueue.add(1);
        arrayQueue.add(3);
        arrayQueue.add(4);
        arrayQueue.add(4);
//        arrayQueue.add(null);
//        arrayQueue.add(null);
        System.out.println("ArrayQueue implementation: " + arrayQueue);

        // ConcurrentLinkedDeque
        Deque<Integer> concurrentLinkedDeque = new ConcurrentLinkedDeque<>();
        concurrentLinkedDeque.add(2);
        concurrentLinkedDeque.add(1);
        concurrentLinkedDeque.add(3);
        concurrentLinkedDeque.add(4);
        concurrentLinkedDeque.add(4);
//        concurrentLinkedDeque.add(null);
//        concurrentLinkedDeque.add(null);
        System.out.println("ConcurrentLinkedDeque implementation: " + concurrentLinkedDeque);
    }

}
