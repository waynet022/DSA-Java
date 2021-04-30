package arrays;
import arrays.Array;

import java.util.ArrayList;

public class ArraysMain {
    public static void main(String[] args){
        Array numbers = new Array(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        numbers.insert(50);
        numbers.removeAt(1);
        System.out.println(numbers.indexOf(30));
        System.out.println(numbers.toString());

//        dynamic array
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.remove(0);
        list.contains(20);
        System.out.println(list);
        System.out.println(list.size());

        System.out.println(list.toArray());
    }
}