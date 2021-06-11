package heaps;

import java.util.Arrays;

public class Heap {
    private int[] heapArray;
    private int size;

    public Heap(int length){
        this.heapArray = new int[length];
        this.size = 0;
    }

    public void insert(int value){
        if(size>=heapArray.length)
            this.resizeHeapArray();

        heapArray[size] = value;
        size++;

        int nodeIndex = size-1;
        while(isGreaterThanParent(nodeIndex)){
            bubbleUp(nodeIndex);
            nodeIndex = (nodeIndex-1)/2;
        }
    }

    private boolean isGreaterThanParent(int index){
        if(isRoot(index)) return false;

        int parentIndex = (index-1)/2;
        return (heapArray[index] > heapArray[parentIndex]);
    }

    private void bubbleUp(int index){
        int parentIndex = (index-1)/2;
        int temp = heapArray[index];
        heapArray[index] = heapArray[parentIndex];
        heapArray[parentIndex] = temp;
    }

    private boolean isRoot(int index){
        return index == 0;
    }

    private void resizeHeapArray(){
        int[] tempArray = new int[heapArray.length*2];
        for(int i = 0; i<size; i++){
            tempArray[i] = heapArray[i];
        }
        heapArray = tempArray;
    }

    public void remove(){
        if(isEmpty()) return;
        heapArray[0] = heapArray[size-1];
        size--;
        int index = 0;
        while(isLessThanChildren(index)){
            index = bubbleDown(index);
        }
    }

    private boolean isLessThanChildren(int index){
        int leftChildIndex = index * 2 + 1;
        int rightChildIndex = index * 2 + 2;

        if(leftChildIndex >= size) return false;

        boolean isLeftGreater = isGreaterThanParent(leftChildIndex);
        boolean isRightGreater = false;

        if(rightChildIndex < size) isRightGreater = isGreaterThanParent(rightChildIndex);

        return isLeftGreater && isRightGreater;
    }

    private int bubbleDown(int index){
        int leftChildIndex = index * 2 + 1;
        int rightChildIndex = index * 2 + 2;

        if(leftChildIndex >= size) return index;

        int swapIndex = rightChildIndex;
        if(rightChildIndex >= size ||heapArray[leftChildIndex] > heapArray[rightChildIndex])
            swapIndex = leftChildIndex;

        int temp = heapArray[index];
        heapArray[index] = heapArray[swapIndex];
        heapArray[swapIndex] = temp;

        return swapIndex;
    }

    public boolean isEmpty(){
        return this.size == 0;
    }

    public String toString(){
        int[] copy = Arrays.copyOf(heapArray, size);
        return Arrays.toString(copy);
    }
}
