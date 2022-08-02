package com.dsa.stack;

import java.util.Arrays;

public class StackWithArrayImpl<T> implements StackWithArray<T>{
    T[] stackArray = null;
    int top = -1;
    int sizeOfStack;

    public StackWithArrayImpl(int size) {
        this.stackArray = (T[]) new Object[size];
        this.sizeOfStack = size;
    }

    @Override
    public boolean isStackEmpty(){
        if(this.top == -1) {
            return true;
        }
        return false;
    }

    @Override
    public void push(T data) {
      if((this.top + 1) == this.sizeOfStack) {
          System.out.println("Stack is Full");
          return;
      }
      this.top = this.top + 1;
      this.stackArray[this.top] = data;
      System.out.println("Data added successfully");
    }

    @Override
    public T pop() {
        if(this.top == -1) {
            System.out.println("Stack is Empty");
            return null;
        }
        T data = this.stackArray[this.top];
        this.stackArray[this.top] = null;
        this.top = this.top - 1;
        return data;
    }

    @Override
    public T peek() {
        if(this.top == -1) {
            System.out.println("Stack is Empty");
            return null;
        }
        return this.stackArray[this.top];
    }

    @Override
    public boolean stackSearch(T searchData) {
        int tempTop = this.top;
        while(tempTop != -1){
            T data = this.stackArray[tempTop];
            if(data.equals(searchData)){
                return true;
            }
            tempTop--;
        }
        return false;
    }

    @Override
    public void printStack(){
        System.out.println(Arrays.toString(this.stackArray));
    }
}
