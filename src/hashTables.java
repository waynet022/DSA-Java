import java.util.HashMap;
import java.util.Map;

public class hashTables {
    public static void main(String[] args){
        mapSample();
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
