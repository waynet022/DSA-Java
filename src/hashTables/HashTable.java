package hashTables;

import java.util.LinkedList;

public class HashTable {
    private static class Entry{
        private final int key;
        private String value;
        private Entry(int key, String value){
            this.key = key;
            this.value = value;
        }
    }

    private LinkedList<Entry>[] data;

    public HashTable(){
        data = new LinkedList[5];
    }

    public void put(int key, String value){

        int index = getIndexByKey(key);
        if(data[index]==null)
            data[index] = new LinkedList<>();
        var bucket = data[index];
        for(var e: bucket){
            if(e.key == key){
                e.value = value;
                return;
            }
        }
        
        bucket.addLast(new Entry(key,value));

    }

    public String get(int key){
        int index = getIndexByKey(key);

        for(Entry e: data[index]){
            if(e.key == key)
                return e.value;
        }

        throw new IllegalStateException();
    }

    public void remove(int key){
        int index = getIndexByKey(key);
        for(Entry e: data[index]){
            if(e.key == key){
                data[index].remove(e);
                return;
            }
        }
    }

    private int getIndexByKey(int key){
        return key % this.data.length;
    }


}
