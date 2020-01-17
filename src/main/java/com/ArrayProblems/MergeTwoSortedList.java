package com.ArrayProblems;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwoSortedList {



    public static List<Integer> solve(ArrayList<Integer> a,List<Integer> b){

        int s1 = a.size();
        int s2 = b.size();

        int i=0;
        int j=0;

        List<Integer> r = new ArrayList <>();

        while(i<s1 || j<s2){
            while(i>=s1 && j<s2){
                r.add(b.get(j));
                j++;
            }
            while(j>=s2 && i<s1){
                r.add(a.get(i));
                i++;
            }


            while(i<s1 && j<s2&&a.get(i)<=b.get(j)) {
                r.add(a.get(i));
                i++;
            }
            while(i<s1 && j<s2&& a.get(i)>b.get(j)){
                r.add(b.get(j));
                j++;
            }




        }

        a.clear();
        for(Integer x: r) a.add(x);
        return a;


    }

    public static void main(String[] args) {
        Integer a1[] = {-4,-3};
        Integer a2[] ={-2,-2};
        ArrayList<Integer> l1 =(ArrayList) Arrays.asList(a1);
        List<Integer> l2 = Arrays.asList(a2);
        solve(l1,l2).forEach(System.out::print);
        l1.forEach(System.out::print);
    }



}
