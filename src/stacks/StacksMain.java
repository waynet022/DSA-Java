package stacks;

import java.util.Stack;

public class StacksMain {
    public static void main(String[] args){
//        normalStack();
//        reverseString();
        balanceExpressions();

    }

    public static void balanceExpressions(){
        String sample = "hello{}";
        Stack<Character> stack = new Stack<>();
        for(char ch: sample.toCharArray()){
            if(ch=='{') stack.push(ch);
            if(ch=='}'){
                if(stack.isEmpty() || stack.peek()!='{'){
                    System.out.println("Unbalanced");
                    return;
                }
                else stack.pop();
            }
        }
        if(!stack.isEmpty()) System.out.println("Unbalanced");
        else System.out.println("Balanced");
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
        for(char ch: example.toCharArray())
            stack.push(ch);

        StringBuffer output = new StringBuffer();
        while(!stack.isEmpty()){
            output.append(stack.pop());
        }
        System.out.println(output);
    }
}
