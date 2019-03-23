package com.compilsoft.generics.collections;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.add("Tamilore");
        queue.add("Segun");
        queue.add("Sola");
        queue.add("Kunle");

        for (String s:queue
             ) {
            System.out.println(s);
        }

        System.out.println(queue.element()); // like peek in stack

        System.out.println(queue.remove());


    }
}
