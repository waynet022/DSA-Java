package stacks;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Stack;

public class Stacks {

    private static final List<Character> leftBrackets = Arrays.asList('(', '[', '{', '<');
    private static final List<Character> rightBrackets = Arrays.asList(')', ']', '}', '>');

    private int[] stack;
    private int size;

    public Stacks(){
        this.stack = new int[5];
        size = 0;
    }

    public void push(int value){
        if(size>=this.stack.length)
            this.copyNewStack();
        this.stack[size] = value;
        this.size++;
    }

    private void copyNewStack(){
        int[] tempStack = new int[this.stack.length*2];
        for(int i = 0; i < this.stack.length; i++)
            tempStack[i] = this.stack[i];
        this.stack = tempStack;
    }

    public int pop(){
        if(this.isEmpty()) throw new NoSuchElementException();

        int output = this.stack[0];
        for(int i = 0; i < this.size; i++){
            this.stack[i] = this.stack[i+1];
        }
        this.size--;
        return output;
    }

    public int peek(){
        return this.stack[0];
    }

    private boolean isEmpty(){
        return this.size == 0;
    }

    public static boolean bracketBalance(String sample){
        Stack<Character> stack = new Stack<>();
        for(char ch: sample.toCharArray()){
            if(isLeftBracket(ch))
                stack.push(ch);

            if(isRightBracket(ch)){
                if(stack.isEmpty()) return false;

                var top = stack.pop();
                if(!bracketsMatch(top,ch)) return false;
            }
        }
        return stack.isEmpty();
    }

    private static boolean isLeftBracket(char ch){
        return leftBrackets.contains(ch);
    }

    private static boolean isRightBracket(char ch){
        return rightBrackets.contains(ch);
    }

    private static boolean bracketsMatch(char left, char right){
        return leftBrackets.indexOf(left) == rightBrackets.indexOf(right);
    }
}