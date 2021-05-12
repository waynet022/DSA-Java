package queues;

import java.util.Stack;

public class StackQueue {
    Stack<Integer> queue = new Stack<>();
    Stack<Integer> temp = new Stack<>();

    public StackQueue(){

    }

    public void enqueue(int value){
        temp.push(value);
    }

    public int dequeue(){
        if(isEmpty())
            throw new IllegalStateException();
        moveStacks();
        return queue.pop();
    }

    private void moveStacks() {
        if (queue.isEmpty())
            while (!temp.isEmpty())
                queue.push(temp.pop());
    }

    public int peek(){
        if(isEmpty())
            throw new IllegalStateException();
        moveStacks();
        return queue.peek();
    }

    public boolean isEmpty(){
        return queue.isEmpty() && temp.isEmpty();
    }
}
