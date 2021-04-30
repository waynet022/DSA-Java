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
        int[] temp = new int[this.mainArray.length];

        for(int i = 0; i < this.mainArray.length; i++)
            temp[i] = this.mainArray[i];

        this.mainArray = new int[this.mainArray.length*2];

        for(int i = 0; i < temp.length; i++)
            this.mainArray[i] = temp[i];
    }

    public void removeAt(int index){
        if(index >= 0 || index < this.size){
            for(int i = index; i<this.mainArray.length-1; i++)
                this.mainArray[i] = this.mainArray[i+1];

            this.size--;
        }

    }

    public String toString(){
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
