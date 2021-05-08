package stacks;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Stacks {

    private static final List<Character> leftBrackets = Arrays.asList('(', '[', '{', '<');
    private static final List<Character> rightBrackets = Arrays.asList(')', ']', '}', '>');

    public Stacks(){

    }

    public static boolean bracketBalance(String sample){
        Stack<Character> stack = new Stack<>();
        for(char ch: sample.toCharArray()){
            if(isLeftBracket(ch))
                stack.push(ch);

            if(isRightBracket(ch)){
                if(stack.isEmpty()) return false;

                var top = stack.pop();
                if(bracketsMatch(top,ch)) return false;
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
