package com.ILinkedList;

import java.util.*;
import java.util.function.Consumer;

public class MyLinkedList<E> implements ILinkedList<E> {
    private Node<E> first;
    private Node<E> last;
    private int size;

    void printList()                //печать списка
    {
        Node t = first;
        while (t != null)
        {
            System.out.print(t.getData() + " "+t.getNext()+" --> ");
            t = t.getNext();
        }
        System.out.println();
    }


    @Override
    public void add(E element) {
        if(size==0){
            first = new Node(element);
            last = first;
            size=1;
            return;
        }
        Node node = new Node(element);
        last.setNext(node);
        last = node;
        size++;
    }

    @Override
    public void add(int index, E element) {
        if(index>size){
            throw new ArrayIndexOutOfBoundsException("POS > SIZE");
        }
        if((index==0 && size==0) || index==size){
            add(element);
            return;
        }
        if(index==0 && size>0){
            first = new Node(element,first);
            size++;
            return;
        }
        Node cursor = first;
        for (int i=0;i<index;i++){
            cursor = cursor.getNext();
        }
        Node elem = new Node(element,cursor.getNext());
        cursor.setNext(elem);
        size++;
    }

    @Override
    public void clear() {
        Node<E> x = first;
        //Занулить все элементы
        for (int i = 0; i < size; i++){
                x.setData(null);
                x=x.getNext();
        }
        first=null;
        last=null;
        size =0;
    }

    @Override
    public E get(int index) {
        Node<E> x = first;
        if(index>size){
            throw new IndexOutOfBoundsException("Мимо");
        }
            for (int i = 0; i < index; i++){
                if(!(i==index)) {
                    x = x.getNext();
                    x.getData();
                }
        }
        return x.getData();
    }

    @Override
    public int indexOf(E element) {
        int ret=0;
        Node<E> x = first;
        for(int i=0;i<size;i++){
            if(element==x.getData()){
                 return ret = i;
            }else {
                 ret = -1;
            }
           x= x.getNext();
        }
        return ret;
    }

    @Override
    public E remove(int index) {
        if(index>size){
            throw new ArrayIndexOutOfBoundsException("POS > SIZE");
        }

        if(index==size){
            last = null;
            size--;
            return null;
        }

        if(index==0 && size>0){
            first = first.getNext();
            size--;
            return null;
        }

        Node t = first;
        Node t1 = t;
        for(int i=0;i<=index;i++){
            t=t.getNext();
            if(i==index){
                for(int j=0;j<index;j++){
                    if(i-1==j){
                        t1.setNext(t);
                    }
                    t1=t1.getNext();
                }
            }
        }
        size--;
        return null;
    }

    @Override
    public E set(int index, E element) {
        Node ch = first;
        if(index>size){
            throw new ArithmeticException("POS>SIZ");
        }
        for(int i=0;i<=index;i++){
            if(i==index){
                ch.setData(element);
            }
            ch = first.getNext();
        }
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E[] toArray(E[] a) {
        if (a.length < size)
            a = (E[])java.lang.reflect.Array.newInstance(
                    a.getClass().getComponentType(), size);
        int i = 0;
        Object[] result = a;
        for (Node<E> x = first; x != null; x = x.getNext())
            result[i++] = x.getData();

        if (a.length > size)
            a[size] = null;

        return a;
    }

    public E[] toArray() {
        int size = size();
        E[] mas = (E[]) new Object[size];
        for(int i=0;i<size;i++){
            mas[i] = this.get(i);
        }
        return mas;
    }

    @Override
    public String toString() {
        return "first=" + first +
                ", last=" + last +
                ", size=" + size;
    }


    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private Node<E> current = first;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public E next() {
                Node<E> item =  current;
                current = current.getNext();
                return item.getData();
            }

            @Override
            public void remove() {
                for(int i=0;i<=size;i++){
                    if(i==size){
                     MyLinkedList.this.remove(i);
                    }
                }
            }
        };
    }
}
