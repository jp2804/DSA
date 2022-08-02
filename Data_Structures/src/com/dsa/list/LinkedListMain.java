package com.dsa.list;

import com.dsa.list.singlylinkedlist.DoublyLinkedList;
import com.dsa.list.singlylinkedlist.DoublyLinkedListImpl;
import com.dsa.list.singlylinkedlist.SinglyLinkedList;
import com.dsa.list.singlylinkedlist.SinglyLinkedListImpl;

import java.util.ArrayList;
import java.util.List;

public class LinkedListMain {

    public static void main(String args[]) {
        LinkedListMain obj = new LinkedListMain();
        //obj.performOperationsOnSinglyLinkedList();
        obj.performOperationsOnDoublyLinkedList();
        //obj.findPrimeNumbers(150);
    }

    private boolean isPrimeNumber(int number) {
        boolean isPrime = true;
        for(int j = 2 ; j < number ; j++) {
            if(number % j == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    private void findPrimeNumbers(int endNumber) {
        List<Number> primeNumberList = new ArrayList<>();
        for(int i = 2 ; i <= endNumber ; i++) {
           if(isPrimeNumber(i))
               primeNumberList.add(i);
        }
        System.out.println("Prime numbers between 2 to " + endNumber);
        System.out.println(primeNumberList);
    }

    private void performOperationsOnDoublyLinkedList() {
        DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedListImpl<Integer>();

        doublyLinkedList.add(2);
        doublyLinkedList.add(3);
        doublyLinkedList.add(4);
        doublyLinkedList.add(5);
        doublyLinkedList.add(6);
        doublyLinkedList.add(7);
        doublyLinkedList.add(8);
        doublyLinkedList.add(9);
        doublyLinkedList.add(10);

        doublyLinkedList.addHead(1);
        doublyLinkedList.addTail(11);
        doublyLinkedList.addTail(12);
        doublyLinkedList.addTail(13);
        System.out.println("After adding all items : ");
        doublyLinkedList.enumerate();

        doublyLinkedList.removeHead();
        doublyLinkedList.removeHead();
        doublyLinkedList.removeTail();
        System.out.println("After removing head and tails : ");
        doublyLinkedList.enumerate();

        doublyLinkedList.removeByPos(5);
        doublyLinkedList.removeByPos(1);
        doublyLinkedList.removeByPos(8);
        doublyLinkedList.removeByPos(13);
        System.out.println("After removing some values : ");
        doublyLinkedList.enumerate();

        doublyLinkedList.addInPos(1, 1);
        doublyLinkedList.addInPos(2, 2);
        doublyLinkedList.addInPos(3, 3);
        doublyLinkedList.addInPos(7, 7);
        doublyLinkedList.addInPos(12, 12);
        doublyLinkedList.addInPos(15, 15);
        System.out.println("After adding by positions : ");
        doublyLinkedList.enumerate();

        doublyLinkedList.removeFist(1);
        doublyLinkedList.removeFist(13);
        doublyLinkedList.removeFist(10);
        doublyLinkedList.removeFist(12);
        System.out.println("After removing first occur :");
        doublyLinkedList.enumerate();

        doublyLinkedList.reverseLis();
        System.out.println("After reversing the list :");
        doublyLinkedList.enumerate();

        System.out.println("Final list (From tail) :");
        doublyLinkedList.enumerateFromTail();

        System.out.println("Reversing by 2 : ");
        doublyLinkedList.reverseByCount(2);
        doublyLinkedList.enumerate();

        System.out.println("Reversing by 3 : ");
        doublyLinkedList.reverseByCount(3);
        doublyLinkedList.enumerate();

        System.out.println("Reversing by 4 : ");
        doublyLinkedList.reverseByCount(4);
        doublyLinkedList.enumerate();



    }

    private void performOperationsOnSinglyLinkedList() {
        SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedListImpl<Integer>();

        singlyLinkedList.add(2);
        singlyLinkedList.add(3);
        singlyLinkedList.add(4);
        singlyLinkedList.add(5);
        singlyLinkedList.add(6);
        singlyLinkedList.add(7);
        singlyLinkedList.add(8);
        singlyLinkedList.add(9);
        singlyLinkedList.add(10);

        singlyLinkedList.addHead(1);
        System.out.println("After adding all items : ");
        singlyLinkedList.enumerate();


        singlyLinkedList.removeByPos(10);
        System.out.println("After removing 10th Pos : ");
        singlyLinkedList.enumerate();

        singlyLinkedList.removeByPos(6);
        System.out.println("After removing 6th Pos : ");
        singlyLinkedList.enumerate();

        singlyLinkedList.removeByPos(10);


        singlyLinkedList.removeFirst(3);
        singlyLinkedList.removeFirst(12);
        singlyLinkedList.removeFirst(1);
        System.out.println("After removing some values by data : ");
        singlyLinkedList.enumerate();

        singlyLinkedList.reverseList();
        System.out.println("After reversing : ");
        singlyLinkedList.enumerate();

    }
}
