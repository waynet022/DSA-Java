package linkedlist;

import java.util.LinkedList;

public class LinkedListMain {
    public static void main(String[] args){
//        linkedListsSample();
        LinkedListString();
//        containsSample();
//        indexOfSample();
    }

    public static void indexOfSample(){
        LinkedLists list = new LinkedLists();
        for(int i = 0; i<20; i++)
            list.addFirst(i);
        int value = 19;
        System.out.println(list.toString());
        System.out.println(list.indexOf(value));
    }

    public static void containsSample(){
        LinkedLists list = new LinkedLists();
        for(int i = 20; i>0; i--)
            list.addFirst(i);
        int value = 100;
        System.out.println(list.toString());
        System.out.println(list.contains(value));
    }
    public static void LinkedListString(){
        LinkedLists list = new LinkedLists();
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.addLast(100);
        list.addLast(100);
        list.deleteFirst();
        list.deleteLast();
        list.deleteFirst();
        System.out.println(list.toString());
    }

    public static void linkedListsSample(){
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addFirst(5);
        list.removeLast();
        list.removeFirst();
        System.out.println(list);
        System.out.println(list.contains(10));
        System.out.println(list.indexOf(20));
        System.out.println(list.size());
        var array = list.toArray();
    }
}
