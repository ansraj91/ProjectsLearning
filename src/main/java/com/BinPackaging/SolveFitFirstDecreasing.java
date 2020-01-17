package com.BinPackaging;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SolveFitFirstDecreasing {

    ArrayList<Integer> items;
    ArrayList<Bin> bins;
    int capaCityOfBin;
    int numberOfItems;
    int binCounter = 1;


    public SolveFitFirstDecreasing(ArrayList<Integer> items, int capaCityOfBin){

        this.items = items;
        bins = new ArrayList <>(items.size());
        numberOfItems = items.size();
        this.capaCityOfBin = capaCityOfBin;
    }


    public void solve(){
        Collections.sort(items,Collections.reverseOrder());

        if(items.get(0) > capaCityOfBin){
            System.out.println("No feasible solution!!");
            return;
        }

        this.bins.add(new Bin(this.capaCityOfBin,binCounter));



        for(Integer item : items){
            boolean isOk = false;
            int counter = 0;
            while(!isOk){

                if(this.bins.size() == counter){
                    this.bins.add(new Bin(capaCityOfBin,++binCounter));
                    this.bins.get(counter).putItem(item);
                    isOk = true;
                }else  if(this.bins.get(counter).putItem(item)){
                    isOk  = true;
                }else{
                    counter++;
                }
            }
        }







    }

    public void showResult(){
        this.bins.forEach(s->System.out.println(s.toString()));
    }




}
