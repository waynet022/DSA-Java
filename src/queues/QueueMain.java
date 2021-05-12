package queues;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class QueueMain {
    public static void main(String[] args){
//        queueSample();
        customQueue();

    }

    public static void customQueue(){
        ArrayQueue queue = new ArrayQueue(10);
        for(int i=1; i<6;i++)
            queue.enqueue(i*5);
        System.out.println(queue.toString());
        System.out.println(queue.dequeue());
        System.out.println(queue.toString());
        for(int i=0;i<6;i++)
            queue.enqueue(i+100);
        System.out.println(queue.toString());
        while(!queue.isEmpty())
            System.out.println(queue.dequeue());
        System.out.println(queue.toString());
    }

    public static void reverse(Queue<Integer> queue){
        Stack<Integer> stack = new Stack<>();
        while(!queue.isEmpty())
            stack.push(queue.remove());
        while(!stack.isEmpty())
            queue.add(stack.pop());
    }

    public static void queueSample(){
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);
        reverse(queue);
        System.out.println(queue);
    }
}
