package com.compilsoft.generics.collections;

import java.util.Stack;

public class Stacks {

    public static void main(String[] args) {


        Stack<Integer> stack = new Stack<>();

        stack.push(78);
        stack.push(88);
        stack.push(70);
        stack.push(58);

        System.out.println(stack.peek()); // shows element at the top of the stack
        System.out.println(stack.pop());
        System.out.println(stack.size());

        for (Integer i:
             stack) {
            System.out.println(i);
        }
    }
}
