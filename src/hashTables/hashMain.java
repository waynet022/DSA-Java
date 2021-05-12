package hashTables;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class hashMain {
    public static void main(String[] args){
//        mapSample();
        String expression = "A graen apple";
//        repeatingCharacter(expression);
        nonRepeatingCharacter(expression);
    }

    public static void nonRepeatingCharacter(String expression){
        Map<Character, Integer> map = new HashMap<>();
        var chars = expression.toCharArray();
        for(char ch : chars){
            var count = map.containsKey(ch) ? map.get(ch)+1 : 1;
            map.put(ch, count);
        }
       for(char ch: chars){
           if(map.get(ch) == 1){
               System.out.println(ch);
           }
       }

        System.out.println(map);
    }


    public static void repeatingCharacter(String expression){
        Map<Character, Integer> map = new HashMap<>();
        for(char ch: expression.toLowerCase().toCharArray()){
            if(map.containsKey(ch)){
                System.out.println(ch);
                return;
            }
            else{
                map.put(ch, 1);
            }
        }
        System.out.println("No repeating Character");
    }

    public static void mapSample(){
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Mosh");
        map.put(2, "John");
        map.put(3, "Mary");
        System.out.println(map);
        map.put(3, "Wayne");
        map.put(4, null);
        map.put(null, null);
        map.put(null, "yes");
        map.remove(null);
        System.out.println(map);

        var value= map.get(3);
        System.out.println(value);
//        map.put(0, "Marleny");
        var boolOutput = map.containsKey(0);
        System.out.println(boolOutput);
        var boolOutput2 = map.containsValue("Marleny");
        System.out.println(boolOutput2);

        for(var item : map.keySet())
            System.out.println(map.get(item));
    }
}
