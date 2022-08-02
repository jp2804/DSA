package com.dsa.queue;

public interface QueueWithArray<T> {
    void enqueue(T data);
    T dequeue();
    boolean isEmpty();
    boolean isFull();
    T peek();
    void printQueue();

}
