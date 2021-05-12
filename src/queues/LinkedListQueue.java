package queues;

public class LinkedListQueue {
    private class Node{
        private Node next;
        private final int value;
        private Node(int value){
            this.value = value;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public LinkedListQueue(){
        this.size = 0;
    }

    public void enqueue(int value){
        Node current = new Node(value);
        if(this.isEmpty())
            this.head = current;
        else
            this.tail.next = current;

        this.tail = current;
        this.size++;
    }

    public int dequeue(){
        if(this.isEmpty()) throw new IllegalStateException();
        int output = this.head.value;
        this.head = this.head.next;
        this.size--;
        return output;
    }

    public int peek(){
        return this.head.value;
    }

    public int size(){
        return this.size;
    }



    public boolean isEmpty(){
        return this.size==0;
    }


    public String toString(){
        if(this.isEmpty()) throw new IllegalStateException();

        Node current = this.head;
        boolean hasNext = true;
        StringBuilder output = new StringBuilder();

        while(hasNext){
            output.append(current.value);
            if(current.next==null)
                hasNext = false;
            else{
                current = current.next;
                output.append(" ");
            }
        }
        return output.toString();
    }
}
