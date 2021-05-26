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

        for(int i=0; i<size-1; i++)
            for(int j=i+1; j<size; j++)
                if(list[i] > list[j]){
                    temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }

    }


}