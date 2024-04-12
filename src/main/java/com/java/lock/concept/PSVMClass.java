package com.java.lock.concept;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PSVMClass {

    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        lock.lock();
        try {
            // your logic
            System.out.println("this is locked");
        } catch (Exception ex) {
            ex.getMessage();
        } finally {
            lock.unlock();
        }
    }

}
