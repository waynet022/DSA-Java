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
        if(size1+size2>=this.doubleStack.length)
            this.copyNewStack();
        if(size2 > 0)
            for(int i = size1+size2; i >= size1; i--)
                this.doubleStack[i] = this.doubleStack[i-1];
        this.doubleStack[size1] = value;

        this.size1++;
        this.size2++;
    }

    public void push2(int value){
        if(size1+size2>=this.doubleStack.length)
            this.copyNewStack();
        this.doubleStack[size2] = value;
        this.size2++;
    }

    public int pop1(){
        if(isEmpty1()) throw new IllegalStateException();
        int output = doubleStack[size1-1];
        for(int i = size1-1; i<size1+size2-1; i++)
            doubleStack[i] = doubleStack[i+1];
        this.size1--;
        return output;
    }

    public int pop2(){
        if(isEmpty2()) throw new IllegalStateException();
        int output = doubleStack[size1+size2-1];
        this.size2--;
        return output;
    }

    public boolean isEmpty1(){
        return this.size1 == 0;
    }

    public boolean isEmpty2(){
        return this.size2 == 0;
    }

    private void copyNewStack(){
        int[] tempStack = new int[this.doubleStack.length*2];
        for(int i = 0; i < this.doubleStack.length; i++)
            tempStack[i] = this.doubleStack[i];
        this.doubleStack = tempStack;
    }
}
