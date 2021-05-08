package stacks;

import java.util.Stack;

public class Stacks {
    public Stacks(){

    }

    public boolean simpleBalanceExpressions(String sample){
        Stack<Character> stack = new Stack<>();
        for(char ch: sample.toCharArray()){
            if(ch=='{') stack.push(ch);
            else if(ch=='}'){
                if(stack.isEmpty() || stack.peek()!='{'){
                    System.out.println("Unbalanced");
                    return false;
                }
                else stack.pop();
            }
        }
        return stack.isEmpty();
    }

    public boolean balanceExpressions(String sample){
        Stack<Character> stack = new Stack<>();
        for(char ch: sample.toCharArray()){
            if(ch=='{'||ch=='('||ch=='['||ch=='<')
                stack.push(ch);

            else if(ch=='}'){
                if(!stack.isEmpty() && stack.peek()=='{') stack.pop();
                else return false;
            }
            else if(ch==']'){
                if(!stack.isEmpty() && stack.peek()=='[') stack.pop();
                else return false;
            }
            else if(ch==')'){
                if(!stack.isEmpty() && stack.peek()=='(') stack.pop();
                else return false;
            }
            else if(ch=='>'){
                if(!stack.isEmpty() && stack.peek()=='<') stack.pop();
                else return false;
            }

        }
        return stack.isEmpty();
    }
}
