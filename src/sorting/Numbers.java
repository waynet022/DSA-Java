package sorting;

import java.util.Arrays;

public class Numbers {
    private int[] list;
    private int size = 0;

    public Numbers(int size){
        this.list = new int[size];
    }

    public void add(int value){
        if(this.size == this.list.length)
            throw new IndexOutOfBoundsException();
        list[size] = value;
        size++;
    }

    public String toString(){
        var content = Arrays.copyOfRange(list, 0, size);
        return Arrays.toString(content);
    }

    public void bubbleSort(){
        if(this.size == 0 || this.size == 1)
            return;

        int temp;
        boolean isSorted;

        for(int i=0; i<size; i++) {
            isSorted = true;
            for (int j = 1; j < size - i; j++)
                if (list[j - 1] > list[j]) {
                    temp = list[j - 1];
                    list[j - 1] = list[j];
                    list[j] = temp;

                    isSorted = false;
                }
            if(isSorted)
                return;
        }
    }


}