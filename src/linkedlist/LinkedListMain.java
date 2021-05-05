package linkedlist;

import java.util.LinkedList;

public class LinkedListMain {
    public static void main(String[] args){
//        linkedListsSample();
//        LinkedListString();
//        containsSample();
//        indexOfSample();
//        toArraySample();
//        reverseSample();
//        kNodeSample();
        findMiddleSample();
    }

    public static void findMiddleSample(){
        LinkedLists list = new LinkedLists();
        for(int i = 0; i < 9; i++)
            list.addLast(i);
        System.out.println(list.toString());
        System.out.println(list.findMiddle());
    }

    public static void kNodeSample(){
        LinkedLists list = new LinkedLists();
        for(int i = 0; i < 10; i++)
            list.addLast(i+100);
        System.out.println(list.toString());
        System.out.println(list.kFromEnd(10));
    }

    public static void reverseSample(){
        LinkedLists list = new LinkedLists();
        for(int i = 0; i < 10; i++)
            list.addLast(i+100);
        System.out.println(list.toString());
        list.reverse();
        System.out.println(list.toString());
    }

    public static void toArraySample(){
        LinkedLists list = new LinkedLists();
        for(int i = 0; i < 10; i++)
            list.addLast(i+100);
        var array = list.toArray();
        System.out.println(array);
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
        int value = -1;
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
        System.out.println(list.size());
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
