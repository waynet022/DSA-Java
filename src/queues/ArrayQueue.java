package queues;

import java.util.Arrays;

public class ArrayQueue {

    private int[] queue;
    private int front;
    private int back;
    private int size;
    public ArrayQueue(int length){
        this.queue = new int[length];
        this.size = 0;
        this.front = 0;
        this.back = 0;
    }

    public void enqueue(int value){
        if(isEmpty()){
            this.front = 0;
            this.back = 0;
        }
        else if(isFull()){
            System.out.println("Queue is full");
            throw new IndexOutOfBoundsException();
        }
        else{
            back++;
            back = back%queue.length;
        }

        this.queue[this.back] = value;
        this.size++;
    }

    public int dequeue(){
        if(isEmpty()) throw new IllegalStateException();

        int output = this.queue[front];
        this.queue[front] = 0;
        this.size--;

        if(!isEmpty()){
            this.front++;
            this.front = this.front%queue.length;
        }
        return output;
    }

    public int peek(){
        if(isEmpty()) throw new IllegalStateException();
        return this.queue[front];
    }

    public boolean isFull(){
        return this.size == this.queue.length;
    }

    public boolean isEmpty(){
        return this.size == 0;
    }

    public String toString(){
        return Arrays.toString(this.queue);
    }
}
