package com.Recursion;

import java.util.ArrayList;

public class DiceRoll {

    public static void rollDice(int n, ArrayList<Integer> choosen){
        if(n==0){
           choosen.stream().forEach(System.out::print);
            System.out.println();
        }else{
            for(int i=1;i<=6;i++){
                choosen.add(i);
                rollDice(n-1,choosen);
                choosen.remove(choosen.size()-1);
            }
        }


    }

    public static void main(String[] args) {
        rollDice(2,new ArrayList <Integer>());
    }


}
