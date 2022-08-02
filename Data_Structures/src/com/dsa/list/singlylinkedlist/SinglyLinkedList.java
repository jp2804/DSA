package com.dsa.list.singlylinkedlist;

public interface SinglyLinkedList<T> {
    void addHead(T data);

    void add(T data);

    void removeFirst(T data);

    void removeHead();

    void enumerate();

    void removeByPos(int pos);

    void reverseList();

    void reverseByCount(int count);
}
