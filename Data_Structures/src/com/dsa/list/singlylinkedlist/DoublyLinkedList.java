package com.dsa.list.singlylinkedlist;

public interface DoublyLinkedList<T> {

    void addHead(T data);

    void addTail(T data);

    void add(T data);

    void addInPos(int pos, T data);

    void removeHead();

    void removeTail();

    void removeByPos(int pos);

    void removeFist(T data);

    void enumerate();

    void reverseLis();

    void reverseByCount(int count);

    void enumerateFromTail();
}
