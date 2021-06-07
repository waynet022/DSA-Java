package CQ;

import java.util.HashMap;
import java.util.Map;

public class QuestionMain {
    public static void main(String[] args){
//        QuestionNumbers qn = new QuestionNumbers(0, 100);
//        QuestionRope qr = new QuestionRope(20);

//        test();
        testFrequentNumber();
    }

    public static void testFrequentNumber(){
        int[] test = {1,2,3,4,4,1,1,1};
        QuestionMostAppearance question = new QuestionMostAppearance(test);
        System.out.println(question.start());
    }

    public static void test(){
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1,10);
        map.put(2,20);
        map.put(3,30);
        boolean x = map.containsKey(1);
        System.out.println(map.get(1));
        System.out.println(map.get(2));
        System.out.println(map.get(3));
        System.out.println(map.containsValue(3));
//        System.out.println(x);
//
//
//        String y = Integer.toBinaryString(20);
//        System.out.println(y);
    }



}
