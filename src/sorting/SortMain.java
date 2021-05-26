package sorting;

public class SortMain {
    public static void main(String[] args){

        Numbers list = new Numbers(5);
        list.add(2);
        list.add(8);
        list.add(4);
        list.add(1);
        list.add(3);
        System.out.println(list+"\n");

//        bubbleSort(list);
        selectionSort(list);
    }

    public static void bubbleSort(Numbers list){
        System.out.println("Bubble Sort");
        long start = System.nanoTime();
        list.bubbleSort();
        long end = System.nanoTime();
        long elapsedTime = end - start;
        System.out.println("Time: "+elapsedTime);
        System.out.println(list);
    }

    public static void selectionSort(Numbers list){
        System.out.println("Selection Sort");
        long start = System.nanoTime();
        list.selectionSort();
        long end = System.nanoTime();
        long elapsedTime = end - start;
        System.out.println("Time: "+elapsedTime);
        System.out.println(list);
    }
}
