package com.compilsoft.generics.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortingCollection {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        List<String> names = new LinkedList<>();

        numbers.add(10);
        numbers.add(30);
        numbers.add(3);
        numbers.add(5);
        numbers.add(-1);

        names.add("c");
        names.add("z");
        names.add("v");
        names.add("a");
        names.add("r");

        Collections.sort(numbers);
        Collections.sort(names);


        System.out.println(numbers);
        System.out.println(names);
    }
}
