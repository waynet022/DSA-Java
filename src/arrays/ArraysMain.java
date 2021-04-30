package arrays;

import java.util.ArrayList;

public class ArraysMain {
    public static void main(String[] args){

//        dynamicArray();
//        intersection();
//        reverse();
        insertAt();
    }

    public static void insertAt(){
        Array numbers = new Array(5);
        for(int i = 0; i < 10; i++){
            numbers.insert(i*2);
        }
        System.out.println(numbers.toString());
        numbers.insertAt(4,100);
        System.out.println(numbers.toString());

    }

    public static void reverse(){
        Array numbers = new Array(5);
        for(int i = 0; i < 10; i++)
            numbers.insert(i+3);
        System.out.println(numbers.toString());
        numbers.reverse();
        System.out.println(numbers.toString());
    }

    public static void intersection(){
        Array numbersA = new Array(5);
        Array numbersB = new Array(5);
        Array numbersC = new Array(5);
        for(int i = 0; i < 10; i++){
            numbersA.insert(i*2);
            numbersB.insert(i*3);
            numbersC.insert(i*40);
        }

        System.out.println(numbersA.toString());
        System.out.println(numbersB.toString());
        System.out.println(numbersC.toString());

        Array intersectionAB = numbersA.intersect(numbersB);
        Array intersectionAC = numbersA.intersect(numbersC);
        System.out.println("Intersection of A-B "+intersectionAB.toString());
        System.out.println("Intersection of A-C "+intersectionAC.toString());
    }
    //dynamic array sample
    public static void dynamicArray(){
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