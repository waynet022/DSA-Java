package hashSets;

import java.util.HashSet;
import java.util.Set;

public class hashMain {
    public static void main(String[] args){
//        setSample();
        String expression = "a green apple";
        firstRepeatedCharacter(expression);
    }

    public static void firstRepeatedCharacter(String expression){
        Set<Character> set = new HashSet<>();
        var chars = expression.toCharArray();
        for(char ch: chars){
            if(set.contains(ch)){
                System.out.println(ch);
                return;
            }
            else
                set.add(ch);
        }
        System.out.println("No repeats");
    }

    public static void setSample(){
        Set<Integer> set = new HashSet<>();
        int[] numbers = {1, 2, 3, 3, 2, 4, 1};
        for(var number: numbers)
            set.add(number);
        System.out.println(set);
        set.clear();
        System.out.println(set);
    }
}
