package linkedlist;

import java.util.NoSuchElementException;

public class LinkedLists {

    private Node head;
    private Node last;
    private int size;

    public LinkedLists(){
        this.size = 0;
    }

    private boolean isEmpty(){
        return this.head == null;
    }

    private boolean isSingleElement(){
        return this.head == this.last;
    }

    public void addFirst(int value){
        Node node = new Node(value);
        if(this.isEmpty())
            this.head = this.last = node;
        else{
            node.next = this.head;
            this.head = node;
        }
        this.size++;
    }

    public void addLast(int value){
        Node node = new Node(value);
        if(this.isEmpty())
            this.head = node;
        else
            this.last.next = node;
        this.last = node;
        this.size++;
    }

    public void deleteFirst(){
        if(isEmpty())
            throw new NoSuchElementException();
        if(this.isSingleElement()){
            this.head = null;
            this.last = null;
        }
        else{
            var secondNode = this.head.next;
            this.head.next = null;
            this.head = secondNode;
        }
        this.size--;
    }

    public void deleteLast(){
        if(this.isEmpty())
            throw new NoSuchElementException();
        if(this.isSingleElement()){
            this.head = null;
            this.last = null;
        }
        else{
            this.last = getPrevious(this.last);;
            this.last.next = null;
        }
        this.size--;
    }

    private Node getPrevious(Node node){
        var currentNode = this.head;
        while(currentNode != null){
            if(currentNode.next == node) return currentNode;
            currentNode = currentNode.next;
        }
        return null;
    }

    public boolean contains(int value){
       return indexOf(value) != -1;
    }

    public int indexOf(int value){
        if(this.head == null)
            return -1;
        int index = 0;
        Node currentNode = this.head;
        boolean hasNext = true;

        while(hasNext){
            if(currentNode.value == value)
                return index;
            if(currentNode.next == null)
                hasNext = false;
            else{
                currentNode = currentNode.next;
                index++;
            }
        }
        return -1;
    }

    public int size(){
        return this.size;
    }

    public int[] toArray(){
        int[] array = new int[this.size];
        var currentNode = this.head;
        int index = 0;
        while(currentNode != null){
            array[index++] = currentNode.value;
            currentNode = currentNode.next;
        }
        return array;
    }

    public String toString(){
        String output = "";
        if(this.head == null)
            return "";
        Node currentNode = head;

        while(currentNode.next != null){
            output += currentNode.value + " ";
            currentNode = currentNode.next;
        }
        output += currentNode.value;

        return output;
    }

    private static class Node{
        private final int value;
        private Node next;
        private Node(int value){
            this.value = value;
        }
    }
}
