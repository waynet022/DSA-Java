package sorting;

import java.util.LinkedList;
import java.util.List;

public class Numbers {
    private List<Integer> list = new LinkedList<>();

    public Numbers(){

    }

    public void add(int value){
        list.add(value);
    }

    public String toString(){
        return list.toString();
    }

    
}
