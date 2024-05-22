package com.java.collections.framework;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BlockingQueueImplementation {

    public static void main(String[] args) {

        Queue<String> arrayBlockingQueue = new ArrayBlockingQueue<>(5);
        arrayBlockingQueue.add("hi");
        arrayBlockingQueue.add("apple");
        arrayBlockingQueue.add("bye");

        // arrayBlockingQueue
        System.out.println("ArrayBlockingQueue.....");

        System.out.println("object status: " + arrayBlockingQueue);

        System.out.println("add method: " + arrayBlockingQueue.add("yes"));

        System.out.println("object status: " + arrayBlockingQueue);

        System.out.println("offer method: " + arrayBlockingQueue.offer("please"));

        System.out.println("object status: " + arrayBlockingQueue);

        System.out.println("peek method: " + arrayBlockingQueue.peek());

        System.out.println("object status: " + arrayBlockingQueue);

        System.out.println("remove 'apple' method: " + arrayBlockingQueue.remove("apple"));

        System.out.println("object status: " + arrayBlockingQueue);

        System.out.println("put method: " + arrayBlockingQueue.add("banana"));

        System.out.println("object status: " + arrayBlockingQueue);

        System.out.println("take method: " + arrayBlockingQueue.poll());

        System.out.println("object status: " + arrayBlockingQueue);

        System.out.println("ArrayBlockingQueue.....");
        // arrayBlockingQueue
    }

}
