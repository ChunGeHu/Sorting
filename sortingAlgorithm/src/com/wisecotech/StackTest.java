package com.wisecotech;

import java.util.Stack;

public class StackTest {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(12);
        stack.push(10);
        stack.push(8);
        stack.push(4);
        System.out.println(stack.capacity());
        stack.push(12);
        stack.push(10);
        stack.push(8);
        stack.push(4);
        System.out.println(stack.capacity());

        stack.push(12);
        stack.push(10);
        stack.push(8);
        stack.push(4);
        System.out.println(stack.capacity());

        stack.push(2);

        System.out.println(stack.capacity());

        System.out.println(stack.empty());
        System.out.println("stack.pop(): "+stack.pop());
        System.out.println(stack.toString());

        Integer num1 = stack.peek();
        System.out.println(num1);

        int search = stack.search(10);
        System.out.println(search);

        System.out.println(stack.isEmpty());
        System.out.println(stack.toString());

        stack.add(1,3);
        System.out.println(stack.search(12));
//        stack.clear();
        System.out.println(stack.toString());
    }
}
