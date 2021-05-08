package stacks;

public class DoubleStack {
    private int[] doubleStack;
    private int size1;
    private int size2;

    public DoubleStack(){
        this.doubleStack = new int[10];
        this.size1 = 0;
        this.size2 = 1;
    }

    public void push1(int value){
        
    }

    public void push2(int value){
        this.doubleStack[size2] = value;
    }
}
