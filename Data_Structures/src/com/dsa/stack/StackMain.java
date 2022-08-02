package com.dsa.stack;

public class StackMain {
    public static void main(String args[]){
        StackWithArray<Integer> stack = new StackWithArrayImpl<Integer>(10);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.push(10);
        System.out.println("After push 10 data :");
        stack.printStack();

        stack.push(11);

        if(stack.stackSearch(5)) {
            System.out.println("stack contains 5");
        } else {
            System.out.println("stack not contains 5");
        }
        if(stack.stackSearch(15)) {
            System.out.println("stack contains 15");
        } else {
            System.out.println("stack not contains 15");
        }
        if(stack.stackSearch(1)) {
            System.out.println("stack contains 1");
        } else {
            System.out.println("stack not contains 1");
        }
        if(stack.stackSearch(10)) {
            System.out.println("stack contains 10");
        } else {
            System.out.println("stack not contains 10");
        }

        System.out.println("Peek : " + stack.peek());

        System.out.println("pop : " + stack.pop());
        System.out.println("Pop : " + stack.pop());
        System.out.println("Peek : " + stack.peek());
        System.out.println("After pop 2 data :");
        stack.printStack();

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.push(10);
        System.out.println("After push 10 data :");
        stack.printStack();
    }
}
