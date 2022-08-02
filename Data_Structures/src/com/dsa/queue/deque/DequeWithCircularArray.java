package com.dsa.queue.deque;

public interface DequeWithCircularArray<T> {
    void enqueueFront(T data);
    void enqueueRear(T data);
    T dequeueFront();
    T dequeueRear();
    void printQueue();
    boolean searchQueue(T data);
}

