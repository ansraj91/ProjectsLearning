package com.Stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SlidingWindow_bruteForce {

    public ArrayList<Integer> slidingMaximum(final List<Integer> A, int B) {
        ArrayList<Integer> maxValues = new ArrayList <>();
        for(int i=0;i<A.size()-B+1;i++){
            maxValues.add(getMax(A.subList(i,i+B)));
        }

        return maxValues;

    }

    public int getMax(List<Integer> al){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<al.size();i++){
            if(max<al.get(i)){
                max = al.get(i);
            }
        }

        return max;
    }

    public static void main(String[] args) {
        SlidingWindow_bruteForce sl = new SlidingWindow_bruteForce();
        Integer arr[] ={1, 3, -1, -3, 5, 3, 6, 7};
        List l = Arrays.asList(arr);
        sl.slidingMaximum(l,3).forEach(System.out::println);
    }
}
