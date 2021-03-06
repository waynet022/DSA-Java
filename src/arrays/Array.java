package arrays;

public class Array {
    private int size;
    private int[] mainArray;

    public Array(int length){
        this.size = 0;
        mainArray = new int[length];
    }

    public void insert(int number){
        if(this.size >= this.mainArray.length)
            this.copyArray();
        this.mainArray[size] = number;
        this.size++;
    }

    private void copyArray(){
        int[] temp = new int[this.mainArray.length*2];

        for(int i = 0; i < this.mainArray.length; i++)
            temp[i] = this.mainArray[i];

        this.mainArray= temp;
    }

    public void removeAt(int index){
        if(index >= 0 && index < this.size){
            for(int i = index; i<this.mainArray.length-1; i++)
                this.mainArray[i] = this.mainArray[i+1];

            this.size--;
        }
        else
            throw new IllegalArgumentException();
    }

    public int indexOf(int number){
        if(this.size == 0)
            return -1;
        for(int i = 0; i < this.size; i++)
            if(number == this.mainArray[i])
                return i;
        return -1;
    }

    public int max(){
        if(this.size == 0)
            return 0;
        else if(this.size == 1)
            return this.mainArray[0];
        int maximum = this.mainArray[0];

        for(int i = 1; i<this.size; i++)
            if(maximum < this.mainArray[i])
                maximum = this.mainArray[i];

        return maximum;
    }

    public Array intersect(Array secondArray){
        Array outputArray = new Array(5);
        for(int i = 0; i < this.size; i++)
            if(secondArray.indexOf(this.mainArray[i]) != -1)
                outputArray.insert(this.mainArray[i]);

        return outputArray;
    }

    public void reverse(){
        if(this.size > 1){
            for(int i = 0; i < size/2; i++){
                int temp = this.mainArray[i];
                this.mainArray[i] = this.mainArray[size-1-i];
                this.mainArray[size-1-i] = temp;
            }
        }
    }

    public void insertAt(int index, int number){
        this.insert(number);
        for(int i = index; i < size-1; i++){
            int temp = this.mainArray[i];
            this.mainArray[i] = this.mainArray[size-1];
            this.mainArray[size-1] = temp;
        }
    }

    public String toString(){
        if(this.size == 0)
            return "[]";
        String arrayString = "[";
        for(int i = 0; i < this.size-1; i++){
            arrayString += this.mainArray[i];
            arrayString += ", ";
        }
        arrayString += this.mainArray[this.size-1];
        arrayString += "]";

        return arrayString;
    }

}
