package priorityQueues;

import java.util.Arrays;

public class PrioQueue {

    private int[] pQueue;
    private int size;

    public PrioQueue(int length){
        this.pQueue = new int[length];
        this.size = 0;
    }

    public void add(int value){
        if(this.isEmpty())
            pQueue[0] = value;

        if(this.isFull())
            throw new IllegalStateException();

        int index = shiftQueueToInsert(value);
        pQueue[index] = value;
        size++;
    }

    private int shiftQueueToInsert(int value){
        int index;
        for(index = size-1; index>=0; index--){
            if(pQueue[index] > value)
                pQueue[index+1] = pQueue[index];
            else
                break;
        }
        return index+1;
    }

    public int remove(){
        if(this.isEmpty()) throw new IllegalStateException();
        int output = pQueue[size-1];
        for(int i=0; i<size; i++)
            pQueue[i] = pQueue[i+1];
        size--;
        return output;
    }

    public int peek(){
        if(this.isEmpty()) throw new IllegalStateException();
        return pQueue[0];
    }

    public boolean isFull(){
        return this.pQueue.length == this.size;
    }

    public boolean isEmpty(){
        return this.size == 0;
    }

    public String toString(){
        return Arrays.toString(pQueue);
    }
}
