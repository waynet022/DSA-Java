package PriorityQueues;

import java.util.PriorityQueue;

public class PriorityQueuesMain {

    public static void main(String[] args){
//        prioritySample();
        priorityImplementation();
    }

    public static void priorityImplementation(){
        PrioQueue queue = new PrioQueue(5);
        queue.add(5);
        queue.add(1);
        queue.add(10);
        queue.add(3);
        queue.add(2);
        queue.add(7);
        System.out.println(queue.toString());

    }

    public static void prioritySample(){
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(5);
        queue.add(1);
        queue.add(3);
        queue.add(2);
        while(!queue.isEmpty())
            System.out.println(queue.remove());
    }
}
