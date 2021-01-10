package com.ILinkedList;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class MainClass {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        LinkedList list1 = new LinkedList();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
       // list.set(1,100);
       // list.printList();
       // System.out.println(Arrays.toString(list.toArray()));
        Iterator iterator = list.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
            iterator.remove();
            System.out.println(Arrays.toString(list.toArray()));
        }

        //list.delete(4);

    }
}
