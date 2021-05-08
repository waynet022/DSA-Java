package stacks;

import java.util.Stack;

public class Stacks {
    public Stacks(){

    }

    public boolean balanceExpressions(String sample){
        Stack<Character> stack = new Stack<>();
        for(char ch: sample.toCharArray()){
            if(ch=='{') stack.push(ch);
            if(ch=='}'){
                if(stack.isEmpty() || stack.peek()!='{'){
                    System.out.println("Unbalanced");
                    return false;
                }
                else stack.pop();
            }
        }
        if(!stack.isEmpty()) return false;
        else return true;
    }

}
