package linkedlist;

public class LinkedLists {

    private Node head;
    private Node last;

    public LinkedLists(){

    }

    public void addFirst(int value){
        Node node = new Node(value);
        node.next = this.head;
        this.head = node;
        if(this.head.next == null)
            this.last = node;
    }

    public void addLast(int value){
        Node node = new Node(value);
        if(this.head == null)
            this.head = node;
        else
            this.last.next = node;
        this.last = node;
    }

    public void deleteFirst(){
        if(this.head == null)
            return;
        if(this.head == this.last){
            this.head = null;
            this.last = null;
        }
        else{
            Node temp = this.head;
            this.head = this.head.next;
            temp.next = null;
        }
    }

    public void deleteLast(){
        if(this.head == null)
            return;
        if(this.head == this.last){
            this.head = null;
            this.last = null;
        }
        else{
            Node currentNode = this.head;
            while(currentNode.next != this.last)
                currentNode = currentNode.next;
            currentNode.next = null;
            this.last = currentNode;
        }
    }

    public boolean contains(int value){
        if(this.head == null)
            return false;

        Node currentNode = this.head;
        boolean hasNext = true;
        while(hasNext){
            if(currentNode.value == value)
                return true;
            if(currentNode.next == null)
                hasNext = false;
            else
                currentNode = currentNode.next;
        }
        return false;
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
