package stacks;

import java.util.Stack;

public class StacksMain {
    public static void main(String[] args){
//        normalStack();
        reverseString();

    }

    public static void normalStack(){
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }

    public static void reverseString(){
        String example = "great";
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < example.length(); i++){
            stack.push(example.charAt(i));
        }
        String output = "";
        while(!stack.isEmpty()){
            output+=stack.pop();
        }
        System.out.println(output);
    }
}
