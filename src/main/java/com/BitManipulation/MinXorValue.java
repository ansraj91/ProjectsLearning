package com.BitManipulation;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinXorValue {

    public static  int solve(ArrayList<Integer> A){
        A.sort(null);
        int X = A.get(0);
        int minSort = Integer.MAX_VALUE;
        for(int i=1;i<A.size()-1;i++){
            if((A.get(i-1)^A.get(i)) < minSort){
                minSort = (A.get(i-1)^A.get(i));
            }
        }

        return minSort;
    }

    public static void main(String[] args) {
        Integer arr[] = {0, 5, 7, 2};
        List<Integer> al = Arrays.asList(arr);
        System.out.println(solve(new ArrayList <>(al)));
    }
}
