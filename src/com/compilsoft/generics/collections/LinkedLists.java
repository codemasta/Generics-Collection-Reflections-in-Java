package com.compilsoft.generics.collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedLists {


    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();

        list.add(3);
        list.add(10);
        list.add(20);
        list.add(13);
        list.add(100);
        list.add(210);

        list.remove(0); // this is why we like linkedList bcos this is very fast


        System.out.println("GET : " + list.get(0)); // not as fast as arraylist

        System.out.println("SIZE : " + list.size());

        for (Integer i: list
             ) {
            System.out.println(i);
        }
    }
}
