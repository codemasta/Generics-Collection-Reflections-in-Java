package com.compilsoft.generics.collections;

import java.util.List;
import java.util.Vector;

public class Vectors {

    public static void main(String[] args) {

        List<Integer> vector = new Vector<>(10,5);
        vector.add(10);
        vector.add(15);
        vector.add(20);
        vector.add(30);

        vector.remove(0);

        for (Integer i :
             vector) {
            System.out.println(i);
        }
    }
}
