package com.dsa.queue;

import java.util.Arrays;

public class QueueWithArrayImpl<T> implements QueueWithArray<T> {

    int front = -1;
    int rear = -1;
    T[] queue = null;
    int sizeOfQueue = 0;

    public QueueWithArrayImpl(int size) {
        this.queue = (T[]) new Object[size];
        this.sizeOfQueue = size;
    }

    @Override
    public void enqueue(T data) {
        if (isEmpty()) {
            this.front = 0;
            this.rear = 0;

        } else if (isFull()) {
            System.out.println("Queue is full");
            return;
        } else {
            this.rear = this.rear + 1;
        }
        this.queue[this.rear] = data;
        System.out.println("Data added to queue successfully");
    }

    @Override
    public T dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }
        T data = this.queue[this.front];
        this.queue[this.front] = null;
        this.front = this.front + 1;
        return data;
    }

    @Override
    public boolean isEmpty() {
        if (this.front < 0 || this.front > this.rear) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isFull() {
        if (this.rear == (this.sizeOfQueue - 1)) {
            return true;
        }
        return false;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return this.queue[this.front];
    }

    @Override
    public void printQueue() {
        System.out.println(Arrays.toString(this.queue));
    }
}
