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

    public void reverse(){
        if(this.isEmpty() || this.isSingleElement())
            return;

        boolean hasNext = true;
        this.last = this.head;

        Node currentNode = this.head;
        Node savedNode = currentNode.next;
        currentNode.next = null;

        while(hasNext){
            this.head = savedNode;
            if(savedNode.next != null)
                savedNode = savedNode.next;
            else
                hasNext = false;
            this.head.next = currentNode;
            currentNode = this.head;
        }
    }

    public int kFromEnd(int endIndex){
        if(this.isEmpty())
            throw new NoSuchElementException();
        int mainIndex;
        var currentNode = this.head;
        for(mainIndex = 0; mainIndex < endIndex-1; mainIndex++){
            if(currentNode.next != null)
                currentNode = currentNode.next;
            else
                throw new IndexOutOfBoundsException();
        }
        boolean hasNext = true;
        var kNode = this.head;
        while(hasNext){
            currentNode = currentNode.next;
            mainIndex++;
            kNode = kNode.next;

            if(currentNode.next == null) hasNext = false;
        }

        return kNode.value;
    }

    public int[] findMiddle(){
        if(this.isEmpty()) throw new NoSuchElementException();
        int[] output;
        if(this.isSingleElement()){
            output = new int[1];
            output[0] = this.head.value;
            return output;
        }

        var rightNode = this.head;
        var leftNode = this.head;
        var midNode = this.head;
        boolean hasNext = true;

        while(hasNext){
            rightNode = rightNode.next;
            midNode = midNode.next;

            if(rightNode.next == null){
                hasNext = false;
                output = new int[2];
                output[0] = leftNode.value;
                output[1] = midNode.value;
                return output;
            }
            else{
                rightNode = rightNode.next;
                leftNode = leftNode.next;
                if(rightNode.next == null){
                    hasNext = false;
                    output = new int[1];
                    output[0] = midNode.value;
                    return output;
                }
            }
        }
        output = new int[1];
        output[0] = midNode.value;
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
