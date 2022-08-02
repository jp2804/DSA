package com.dsa.queue;

public class QueueMain {
    public static void main(String args[]){
        QueueWithArray<Integer> queue = new QueueWithArrayImpl<>(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.printQueue();

        System.out.println("Peek 1 : " + queue.peek());
        System.out.println("Dequeue 1 : " + queue.dequeue());
        queue.printQueue();
        System.out.println("Peek 1 : " + queue.peek());
        System.out.println("Dequeue 1 : " + queue.dequeue());
        queue.printQueue();
        System.out.println("Peek 1 : " + queue.peek());
        System.out.println("Dequeue 1 : " + queue.dequeue());
        queue.printQueue();
        System.out.println("Peek 1 : " + queue.peek());
        System.out.println("Dequeue 1 : " + queue.dequeue());
        queue.printQueue();
        System.out.println("Peek 1 : " + queue.peek());
        System.out.println("Dequeue 1 : " + queue.dequeue());
        queue.printQueue();
        queue.dequeue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.printQueue();
        System.out.println("Peek 1 : " + queue.peek());
        System.out.println("Dequeue 1 : " + queue.dequeue());
        queue.printQueue();
        System.out.println("Peek 1 : " + queue.peek());
        System.out.println("Dequeue 1 : " + queue.dequeue());
        queue.printQueue();
        System.out.println(queue.isEmpty());


    }
}
