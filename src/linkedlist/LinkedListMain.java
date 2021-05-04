package linkedlist;

import java.util.LinkedList;

public class LinkedListMain {
    public static void main(String[] args){
//        linkedListsSample();
        LinkedListString();
    }

    public static void LinkedListString(){
        LinkedLists list = new LinkedLists();
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.addLast(100);
        list.addLast(100);
        list.deleteLast();
        list.deleteLast();
        list.deleteLast();
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
