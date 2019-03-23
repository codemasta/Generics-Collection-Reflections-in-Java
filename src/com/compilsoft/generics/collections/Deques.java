package com.compilsoft.generics.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Deques {

    public static void main(String[] args) {

         // Deque -> Double Ended Queue

        Deque<Integer> deque = new ArrayDeque<>();

        deque.offerFirst(10);
        deque.offerLast(20);
        deque.offerFirst(30);
        deque.offerLast(40);

        for (Integer i:
             deque) {
            System.out.println(i);
        }

        deque.removeFirst();
        deque.removeLast();
    }
}
