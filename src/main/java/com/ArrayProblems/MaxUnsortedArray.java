package com.ArrayProblems;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxUnsortedArray {
    public static ArrayList<Integer> subUnsort(List<Integer> A) {
        int len = A.size();
        int brk = -1;
        int brk2 =-1;
        ArrayList<Integer> result = new ArrayList<Integer>();

        List<Integer> l1 = new ArrayList <>(A);

        Collections.sort(l1);
        int i=0;
        int j=A.size()-1;

        if(l1.equals(A)) {
            result.add(-1);
            return result;
        }

        while(A.get(i)==l1.get(i) && i<A.size()-1){
            i++;
        }
        while(A.get(j)==l1.get(j) && j>0){
            j--;
        }

        result.add(i);
        result.add(j);


        return result;
    }

    public static void main(String[] args) {
        Integer[] a1 = new Integer[]{4, 15, 4, 4, 15, 18, 20 };
        List<Integer> l1 = Arrays.asList(a1);


        System.out.println(subUnsort(l1).toString());
    }
}
