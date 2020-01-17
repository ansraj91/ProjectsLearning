package com.Recursion;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Permutation {




    public static void permutation(ArrayList<Character> original, ArrayList<Character> choosen){
        if(original.size() ==0){
            choosen.stream().forEach(System.out::print);
            System.out.println();
        }

        for(int i=0;i<original.size();i++){
            Character c= original.get(i);
            original.remove(i);
            choosen.add(c);
            //System.out.println("After removing :" +c + " Pos:" + i);



            permutation(original,choosen);
            choosen.remove(choosen.size()-1);
            original.add(c);
            //System.out.println("adding back:"  +c  + " pos: " +i);
            /*System.out.println("After unchossen string is:" +string);
            System.out.println("After unchossen choosen is:" +choosen);*/
            //permutation(string,choosen);
        }

    }

    public static void main(String[] args) {
        ArrayList<Character> original = new ArrayList <>();
        String c = "abc";
        for(int i=0;i<c.length();i++){
            original.add(c.charAt(i));
        }
        permutation(original,new ArrayList<Character>());


    }


}
