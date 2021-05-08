package stacks;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Stacks {

    private final List<Character> leftBrackets = Arrays.asList('(', '[', '{', '<');
    private final List<Character> rightBrackets = Arrays.asList(')', ']', '}', '>');

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
            if(this.isLeftBracket(ch))
                stack.push(ch);

            if(this.isRightBracket(ch)){
                if(stack.isEmpty()) return false;

                var top = stack.pop();
                if(bracketsMatch(top,ch)) return false;
            }
        }
        return stack.isEmpty();
    }

    private boolean isLeftBracket(char ch){
        return leftBrackets.contains(ch);
    }

    private boolean isRightBracket(char ch){
        return rightBrackets.contains(ch);
    }

    private boolean bracketsMatch(char left, char right){
        return leftBrackets.indexOf(left) == rightBrackets.indexOf(right);
    }
}
