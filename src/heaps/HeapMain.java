package heaps;

public class HeapMain {
    public static void main(String[] args){
        testHeap();
    }

    static void testHeap(){
        Heap heap = new Heap(5);
        heap.insert(3);
        heap.insert(4);
        heap.insert(5);
        heap.insert(1);
        System.out.println(heap);
    }
}
