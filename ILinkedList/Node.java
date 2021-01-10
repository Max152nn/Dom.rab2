package com.ILinkedList;

public class Node<E> {
    private E data;
    private Node<E> next;

    Node(E data) {
        this.data = data;
    }

    Node(E data,Node<E> next) {
        this.data = data;
        this.next = next;
    }

    E getData() {
        return data;
    }

    void setData(E data) {
        this.data = data;
    }

    Node getNext() {
        return next;
    }

    void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }
}
