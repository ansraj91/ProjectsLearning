package com.CustomHashMap;


public class CustomHashMap<K,V> {

    private Entry<K,V> hashTable[];
    private int capacity = 4;


    static class Entry<K,V>{
        K key;
        V data;
        Entry next;
        int count;

        Entry(K key, V data){
            this.key = key;
            this.data = data;
        }

    }

    public CustomHashMap(){
        hashTable = new Entry[capacity];
    }

    public CustomHashMap(int capacity){
        hashTable = new Entry[capacity];
        this.capacity = capacity;
    }


    public V get(K key){
       int hash = hash(key);
       if(hashTable[hash] == null) return null;
        else{
            Entry<K,V> temp = hashTable[hash];
            while(temp!=null){
                if(temp.key.equals(key)){
                    return temp.data;
                }else{
                    temp = temp.next;
                }


            }


       }

        return null;

    }
    public void put(K key, V value){

        if(key == null) return;
        int hash = hash(key);
        Entry<K,V> newEntry = new Entry <>(key,value);
        Entry<K,V> current = hashTable[hash];
        Entry<K,V> previous = null;
        if(hashTable[hash] == null){
            hashTable[hash] = newEntry;

        }else {
            while (current != null) {
                if (current.key.equals(key)) {
                    if (previous == null) {
                        newEntry.next = current.next;
                        current = newEntry;
                        return;
                    } else {
                        newEntry.next = current.next;
                        previous.next = newEntry;
                    }
                }
                previous = current;
                current = current.next;

            }
            previous.next = newEntry;
        }

    }



    public int hash(K key){
        return Math.abs(key.hashCode()) % capacity;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
                sb.append("{");
        for (Entry e : hashTable){
            while (e!=null){
                sb.append("["+e.key +","+e.data + "],");
                e = e.next;
            }


        }
        sb.append("}");
        return  sb.toString();
    }


}
