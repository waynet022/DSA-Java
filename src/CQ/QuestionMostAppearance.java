package CQ;

import java.util.HashMap;

public class QuestionMostAppearance {

    private int[] test;

    public QuestionMostAppearance(int[] test){
        this.test = test;
    }

    public int start(){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int value : this.test)
            if(map.containsKey(value))
                map.put(value, map.get(value)+1);
            else
                map.put(value, 1);

        return this.frequentKey(map);
    }

    private int frequentKey(HashMap<Integer, Integer> map){
        int maxValue = 0;
        int maxKey = 0;

        for(int key : map.keySet()){
            if(map.get(key) > maxValue){
                maxValue = map.get(key);
                maxKey = key;
            }
        }

        return maxKey;
    }
}
