package arrays;

public class Array {
    private int length;
    private int[] mainArray;

    public Array(int length){
        this.length = length;
        mainArray = new int[length];
    }

    public void insert(int number){
        if(this.length >= this.mainArray.length)
            this.copyArray();
        this.mainArray[length] = number;
        this.length++;
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
        if(index >= 0 || index < this.length){
            for(int i = index; i<this.mainArray.length-1; i++)
                this.mainArray[i] = this.mainArray[i+1];

            this.length--;
        }

    }

}
