package com.dsa.stack;

public interface StackWithArray<T> {
     void push(T data);
     T pop();
     T peek();
     boolean stackSearch(T searchData);
     void printStack();
     boolean isStackEmpty();
}
