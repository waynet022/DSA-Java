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

        var entry = getEntry(key);
        if(entry != null){
            entry.value = value;
            return;
        }
        getOrCreateBucket(key).add(new Entry(key,value));
    }

    public String get(int key){
        Entry entry = getEntry(key);
        return (entry==null) ? null: entry.value;
    }

    public void remove(int key){
        var entry = getEntry(key);
        if(entry == null)
            throw new IllegalStateException();
        getBucket(key).remove(entry);
    }

    private LinkedList<Entry> getBucket(int key){
        return data[getIndexByKey(key)];
    }

    private LinkedList<Entry> getOrCreateBucket(int key){
        var index = getIndexByKey(key);
        var bucket = data[index];
        if(bucket == null)
            data[index] = new LinkedList<>();

        return bucket;
    }

    private Entry getEntry(int key){
        var bucket = getBucket(key);
        if(bucket!=null){
            for(var entry: bucket){
                if(entry.key == key)
                    return entry;
            }
        }
        return null;
    }

    private int getIndexByKey(int key){
        return key % this.data.length;
    }


}
