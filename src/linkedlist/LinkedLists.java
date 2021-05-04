package linkedlist;

public class LinkedLists {

    private Node head;
    private Node last;

    public LinkedLists(){

    }

    public void addFirst(int value){
        Node node = new Node();
        node.value = value;
        node.next = this.head;
        this.head = node;
        if(this.head.next == null)
            this.last = node;
    }

    public void addLast(int value){
        Node node = new Node();
        node.value = value;
        this.last.next = node;
        this.last = node;
    }

    public void deleteFirst(){
        Node temp = this.head;
        this.head = this.head.next;
        temp.next = null;
    }

    public void deleteLast(){
        Node currentNode = this.head;
        while(currentNode.next != this.last)
            currentNode = currentNode.next;
        currentNode.next = null;
        this.last = currentNode;
    }

    public String toString(){
        String output = "";
        Node currentNode = head;

        while(currentNode.next != null){
            output += currentNode.value + " ";
            currentNode = currentNode.next;
        }
        output += currentNode.value;

        return output;
    }

    private class Node{
        private int value;
        private Node next;
    }
}
