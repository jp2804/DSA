package com.dsa.list.singlylinkedlist;

import com.dsa.list.node.NodeDoubly;
import com.dsa.stack.StackWithArrayImpl;
import com.dsa.stack.StackWithArray;

public class DoublyLinkedListImpl<T> implements DoublyLinkedList<T> {

    NodeDoubly head;
    NodeDoubly tail;

    @Override
    public void addHead(T data) {
        NodeDoubly newNode = new NodeDoubly(data);

        if (this.head != null) {
            newNode.prev = null;
            newNode.next = this.head;
            this.head.prev = newNode;
            this.head = newNode;
        } else {
            this.head = newNode;
            this.tail = newNode;
        }
    }

    @Override
    public void addTail(T data) {
        NodeDoubly newNode = new NodeDoubly(data);

        if (this.tail != null) {
            this.tail.next = newNode;
            newNode.prev = this.tail;
            this.tail = newNode;
        } else {
            this.head = newNode;
            this.tail = newNode;
        }
    }

    @Override
    public void add(T data) {
        if (this.head == null) {
            addHead(data);
        } else {
            addTail(data);
        }
    }

    @Override
    public void addInPos(int pos, T data) {
        if (pos == 1) {
            addHead(data);
            return;
        }

        NodeDoubly curNode = this.head;
        for (int i = 1; i < pos; i++) {

            if (curNode.next == null) {
                if ((i + 1) < pos) {
                    System.out.println("Position not found in list");
                    return;
                }
                addTail(data);
                return;
            }
            curNode = curNode.next;
        }

        NodeDoubly newNode = new NodeDoubly(data);
        NodeDoubly prevNode = curNode.prev;
        newNode.prev = prevNode;
        prevNode.next = newNode;
        newNode.next = curNode;
        curNode.prev = newNode;

    }


    @Override
    public void removeHead() {
        if (this.head == null) {
            System.out.println("Remove operation can not be performed on empty list");
            return;
        }

        if (this.tail.equals(this.head)) {
            this.head = null;
            this.tail = null;
            return;
        }

        this.head = this.head.next;
        this.head.prev = null;

    }

    @Override
    public void removeTail() {
        if (this.head == null) {
            System.out.println("Remove Operation can not be performed on empty list");
            return;
        }

        if (this.tail.equals(this.head)) {
            this.head = null;
            this.tail = null;
            return;
        }

        NodeDoubly prevNode = this.tail.prev;
        prevNode.next = null;
        this.tail = prevNode;

    }

    @Override
    public void removeByPos(int pos) {
        if (this.head == null) {
            System.out.println("Remove operation can not be performed on empty list");
            return;
        }

        if (pos == 1) {
            removeHead();
            return;
        }
        NodeDoubly curNode = head;
        for (int i = 1; i <= pos; i++) {
            if (curNode.next == null) {
                if ((i + 1) < pos) {
                    System.out.println("Index not found in the list");
                    return;
                }
                removeTail();
                return;
            }
            curNode = curNode.next;
        }


        NodeDoubly removeNode = curNode.prev;
        NodeDoubly prevNode = removeNode.prev;
        curNode.prev = removeNode.prev;
        prevNode.next = curNode;

    }

    @Override
    public void removeFist(T data) {
        NodeDoubly curNode = this.head;
        int count = 1;
        while (curNode != null) {
            if (curNode.data.equals(data)) {
                removeByPos(count);
                return;
            }
            curNode = curNode.next;
            count = count + 1;
        }
        System.out.println("Data not found");
    }

    @Override
    public void enumerate() {
        NodeDoubly curNode = this.head;

        while (curNode.next != null) {
            System.out.println(curNode.data);
            curNode = curNode.next;
        }
        System.out.println(curNode.data);
    }

    @Override
    public void reverseLis() {
        if(this.head == null) {
            System.out.println("Reverse Operation can not be performed on empty list");
            return;
        }
        NodeDoubly curNode = this.head;
        NodeDoubly prevNode = null;
        NodeDoubly nextNode = null;
        this.head = this.tail;
        this.tail = curNode;
        curNode = this.head;
        while(curNode != null) {
            prevNode = curNode.prev;
            nextNode = curNode.next;
            curNode.prev = nextNode;
            curNode.next = prevNode;
            curNode = curNode.next;
        }
    }

    @Override
    public void reverseByCount(int count) {
        //run a loop till end of the list
             // run a loop for n times
                    // if data != null push the data to stack
            // run a loop for n times
                   // pop stack and put the data to list
        NodeDoubly curNode1 = this.head;
        NodeDoubly curNode2 = this.head;

        while(curNode1 != null) {

            StackWithArray tempStack = new StackWithArrayImpl<>(count);
            int i = 0;
            while(curNode1 != null && i < count){
                tempStack.push(curNode1.data);
                curNode1 = curNode1.next;
                i++;
            }
            i = 0;
            while(!tempStack.isStackEmpty()){
               curNode2.data = tempStack.pop();
               curNode2 = curNode2.next;
               i++;
            }
        }

    }

    @Override
    public void enumerateFromTail() {
        NodeDoubly curNode = this.tail;
        while (curNode.prev != null) {
            System.out.println(curNode.data);
            curNode = curNode.prev;
        }
        System.out.println(curNode.data);
    }
}
