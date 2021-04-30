package arrays;

import java.util.Arrays;

public class ArraysMain {
    public static void main(String[] args){
        int[] numbersA = {10, 20, 30};
        int[] numbersB = new int[3];
        numbersB[0] = 10;
        numbersB[1] = 20;
        numbersB[2] = 30;
        System.out.println(Arrays.toString(numbersB));
        System.out.println(numbersB.length);
    }
}
