package com.Hash;

import java.util.ArrayList;
import java.util.HashMap;

public class Anagrams {

    public static ArrayList<ArrayList<Integer>> solve(ArrayList<String> A){
        HashMap<String,Integer> map = new HashMap <>();
        ArrayList<ArrayList<Integer>> ab = new ArrayList <>();
        for(int i=0;i<A.size();i++){
            map.put(A.get(i),i);
        }

        for(int i=0;i<A.size();i++){
            StringBuilder sb = new StringBuilder(A.get(i));
            String rev = sb.reverse().toString();
            if(map.containsKey(rev)){
                int k = map.get(rev);
                ArrayList<Integer> c = new ArrayList <>();
                c.add(i);
                c.add(k);
                ab.add(c);
                map.remove(rev);
                map.remove(A.get(i));

            }

        }

        return ab;

    }

    //public void

    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList <>();
        a.add("cat");
        a.add("dog");
        a.add("god");
        a.add("tca");
        solve(a).forEach(System.out::println);
    }
}
