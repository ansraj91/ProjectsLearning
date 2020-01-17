package com.BinPackaging;

import java.util.ArrayList;

public class Bin {

    ArrayList<Integer> items;
    int capacity;
    int id;
    int currentSize = 0;


    public Bin(int capacity, int id){
        this.capacity = capacity;
        this.id = id;
        this.items = new ArrayList <>();
    }


    public boolean putItem(Integer item){
        if(this.currentSize +item > this.capacity) return false;
        items.add(item);
        currentSize +=item;
        return true;
    }

    public String toString(){

        String binContent = "Items in the bin, binID:" + this.id +": ";
        return items.toString();
    }



}
