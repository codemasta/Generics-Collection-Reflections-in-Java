package com.compilsoft.generics.collections;

import java.util.Arrays;

public class SortingArrays {

    public static void main(String[] args) {

        // quicksort --> sorting primitives types
        // mergesort --> reference types

        int [] nums = {1,5,3,8,10,-2,0};

        String [] names = {"Zuwe","Sola","Kehinde","Jakande"};

        Arrays.sort(nums);
        Arrays.sort(names);

        for (int n:
             nums) {
            System.out.println(n);
        }

        for (String n:
             names) {
            System.out.println(n);
        }
    }
}
