package com.dsa.queue.deque;

public class DequeWithCircularArrayImpl<T> implements DequeWithCircularArray<T> {

    int arraySize;
    T queue[] = null;
    int front = -1;
    int rear = -1;

    public DequeWithCircularArrayImpl(int size) {
        this.arraySize = size;
        this.queue = (T[]) new Object[size];
    }

    private boolean isCircularQueueFull() {
        if ((this.front == 0 && this.rear == this.arraySize - 1) || (this.front == this.rear + 1))
            return true;
        return false;
    }

    private boolean isCircularQueueEmpty() {
        if (this.front == -1 && this.rear == -1)
            return true;
        return false;
    }

    @Override
    public void enqueueFront(T data) {
        /*
         * if check for queue full condition,
         * else if check for queue is empty condition, if yes front and rear = 0
         * else if check for front is zero, if yes then front = size - 1;
         * else front = front -1;
         * */
        if (isCircularQueueFull()) {
            System.out.println("Queue is full already");
            return;
        } else if (isCircularQueueEmpty()) {
            this.front = 0;
            this.rear = 0;
            this.queue[this.front] = data;
        } else if (this.front == 0) {
            this.front = this.arraySize - 1;
            this.queue[this.front] = data;
        } else {
            this.front = this.front - 1;
            this.queue[this.front] = data;
        }
        System.out.println("Data added successfully in the front point");

    }

    @Override
    public void enqueueRear(T data) {
        /*
         * if check for queue full condition,
         * else if check for queue is empty condition, if yes front and rear = 0
         * else if check for rear is size - 1 , if yes then rear = 0;
         * else rear = rear + 1;
         * */
        if (isCircularQueueFull()) {
            System.out.println("Queue is already full");
            return;
        } else if (isCircularQueueEmpty()) {
            this.front = 0;
            this.rear = 0;
            this.queue[this.rear] = data;
        } else if (this.rear == this.arraySize - 1) {
            this.rear = 0;
            this.queue[this.rear] = data;
        } else {
            this.rear = this.rear + 1;
            this.queue[this.rear] = data;
        }
        System.out.println("Data added successfully in the rear point");
    }

    @Override
    public T dequeueFront() {

        /*
         * if check queue is empty
         * else if queue having only one element
         * else if check front is N -1 , if yes front = 0
         * else front = front + 1
         * */
        T data = null;
        if (isCircularQueueEmpty()) {
            System.out.println("Queue is Empty");
        } else if (this.front == this.rear) {
            data = this.queue[this.front];
            this.front = -1;
            this.rear = -1;
        } else if (this.front == this.arraySize - 1) {
            data = this.queue[this.front];
            this.front = 0;
        } else {
            data = this.queue[this.front];
            this.front = this.front + 1;
        }
        return data;
    }

    @Override
    public T dequeueRear() {
        /*
         * if check queue is empty
         * else if queue having only one element
         * else if check rear is 0 , if yes rear = size - 1
         * else rear = rear - 1
         * */
        T data = null;
        if (isCircularQueueEmpty()) {
            System.out.println("Queue is Empty");
        } else if (this.front == this.rear) {
            data = this.queue[this.rear];
            this.rear = -1;
            this.front = -1;
        } else if (this.rear == 0) {
            data = this.queue[this.rear];
            this.rear = this.arraySize - 1;
        } else {
            data = this.queue[this.rear];
            this.rear = this.rear - 1;
        }
        return data;
    }

    @Override
    public void printQueue() {
        int curElement = this.front;
        if (!isCircularQueueEmpty()) {
            do {
                System.out.println(this.queue[curElement].toString());
                curElement = (curElement + 1) % this.arraySize;
            } while (curElement != this.rear + 1);
        }
    }

    @Override
    public boolean searchQueue(T data) {
        int curElement = this.front;
        if (!isCircularQueueEmpty()) {
            while (curElement != this.rear + 1) {
                if (data.equals(this.queue[curElement]))
                    return true;
                curElement = (curElement + 1) % this.arraySize;
            }
        }
        return false;
    }
}
