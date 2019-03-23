package com.compilsoft.generics.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayLists {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("John");
        list.add("Seun");
        list.add("Segun");
        list.add("Daniel");

        for (String s:
             list) {
            System.out.println(s);
        }

        System.out.println("=====REMOVE OPERATION============");

        list.remove(0);

        for (String s:
                list) {
            System.out.println(s);
        }

        System.out.println("=====GET INDEX OPERATION============");

        System.out.println(list.get(2));


        System.out.println("===== SIZE OPERATION============");

        System.out.println(list.size());


        System.out.println("===== ISEMPTY OPERATION============");

        System.out.println(list.isEmpty());


        System.out.println("===== CONVERT LIST TO ARRAY OPERATION============");

        System.out.println(Arrays.toString(list.toArray()));

        Object [] array = list.toArray();
        for (Object o:
             array) {
            System.out.println(o);
        }

    }

}
