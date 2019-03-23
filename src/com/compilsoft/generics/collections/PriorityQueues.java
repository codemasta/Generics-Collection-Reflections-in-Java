package com.compilsoft.generics.collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueues {
    public static void main(String[] args) {
        Queue<Person> priorityQueue = new PriorityQueue<>();

        priorityQueue.add(new Person("Seun",56));
        priorityQueue.add(new Person("Adeola",45));
        priorityQueue.add(new Person("Tola",15));
        priorityQueue.add(new Person("Kunle",66));
        priorityQueue.add(new Person("Femi",536));

        while (priorityQueue.peek() != null){
            System.out.println(priorityQueue.poll());
        }
    }
}
