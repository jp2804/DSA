package com.dsa.queue.deque;

public class DequeMain {
    public static void main(String args[]){
        DequeWithCircularArray<Integer> dequeue = new DequeWithCircularArrayImpl<>(5);

        dequeue.enqueueFront(1);
        dequeue.enqueueFront(2);
        dequeue.enqueueRear(3);
        dequeue.enqueueFront(4);
        dequeue.enqueueRear(5);
        dequeue.enqueueRear(6);
        dequeue.printQueue();

        System.out.println("...............");
        dequeue.dequeueFront();
        dequeue.dequeueRear();
        dequeue.dequeueFront();
        dequeue.dequeueRear();
        dequeue.dequeueFront();
        dequeue.dequeueRear();
        dequeue.printQueue();
    }
}
