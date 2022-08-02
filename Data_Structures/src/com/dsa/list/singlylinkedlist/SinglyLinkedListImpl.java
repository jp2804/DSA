package com.dsa.list.singlylinkedlist;

import com.dsa.list.node.NodeDoubly;
import com.dsa.list.node.NodeSingly;

public class SinglyLinkedListImpl<T> implements SinglyLinkedList<T> {

    NodeSingly head;

    @Override
    public void addHead(T data) {
        NodeSingly<T> newNode = new NodeSingly<T>(data);

        if (head != null)
            newNode.next = head;

        head = newNode;
    }

    @Override
    public void add(T data) {

        if (head == null) {
            addHead(data);
        } else {
            NodeSingly<T> newNode = new NodeSingly<T>(data);
            NodeSingly curNode = head;
            while (curNode.next != null) {
                curNode = curNode.next;
            }
            curNode.next = newNode;
        }
    }

    @Override
    public void removeHead() {
        head = head.next;
        System.out.println("Removed Head Node");
        return;
    }

    @Override
    public void removeByPos(int pos) {

        if (head == null) {
            System.out.println("Remove Operation Can not be performed on Empty List");
            return;
        }

        if (pos == 1) {
            removeHead();
            return;
        }

        NodeSingly curNode = head;
        NodeSingly prevNode = null;
        for (int i = 1; i < pos; i++) {
            if (curNode == null) {
                System.out.println("Position not found in the list");
                return;
            }
            prevNode = curNode;
            curNode = curNode.next;
        }
        prevNode.next = curNode.next;
    }

    @Override
    public void reverseList() {

        NodeSingly prevNode = null;
        NodeSingly nextNode = null;
        NodeSingly curNode = this.head;

        while(curNode != null) {
            nextNode = curNode.next;
            curNode.next = prevNode;
            prevNode = curNode;
            curNode = nextNode;
            if(curNode == null)
                this.head = prevNode;
        }
    }

    @Override
    public void reverseByCount(int count) {

    }

    @Override
    public void removeFirst(T data) {

        NodeSingly curNode = head;

        if (curNode.data.equals(data)) {
            removeHead();
            return;
        }

        NodeSingly prevNode = null;
        while (curNode.next != null) {
            if (curNode.data.equals(data)) {
                prevNode.next = curNode.next;
                System.out.println("Removed node from middle");
                return;
            }
            prevNode = curNode;
            curNode = curNode.next;
        }
        System.out.println("Data not found");
    }

    @Override
    public void enumerate() {
        NodeSingly curNode = head;
        while (curNode.next != null) {
            System.out.println(curNode.data);
            curNode = curNode.next;
        }
        System.out.println(curNode.data);
    }
}
