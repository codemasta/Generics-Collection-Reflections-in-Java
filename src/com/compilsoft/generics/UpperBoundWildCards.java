package com.compilsoft.generics;

import java.util.Arrays;
import java.util.List;

public class UpperBoundWildCards {

    public static void main(String[] args) {

        sum(Arrays.asList(1,23,4,56,675,33));
    }

    public static void sum(List<? extends Number> list){
        // we can only read from it , we cannot add items to it
        // it only accepts numbers Int , Double , Float
        // subClass of the specified upperBBound

        //  Only RED

        double sum = 0;

        for (Number n : list){
            sum += n.doubleValue();
        }

        System.out.println("Sum = " + sum);
    }
}
