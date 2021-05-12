package hashSets;

import java.util.HashSet;
import java.util.Set;

public class hashMain {
    public static void main(String[] args){
        setSample();
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
