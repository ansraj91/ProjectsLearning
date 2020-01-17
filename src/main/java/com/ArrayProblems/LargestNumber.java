package com.ArrayProblems;

import java.util.*;

public class LargestNumber  {

    /*Given a list of non negative integers, arrange them such that they form the largest number.

For example:

Given [3, 30, 34, 5, 9], the largest formed number is 9534330.*/

    static Comparator comp = (a,b)->{
        String X = String.valueOf(a);
        String Y = String.valueOf(b);
        return (X+Y).compareTo(Y+X)>0?-1:1;
    };

    public static void solve(List<Integer> arr){
        if(arr.stream().allMatch(s->s==0)) System.out.println("0");
        Collections.sort(arr, comp);

        StringBuilder s = new StringBuilder();
        arr.forEach(s::append);

        System.out.println(s.toString());

    }

    public static void main(String[] args) {
        Integer arr[] = {12,32,45,678,98,456,89,989};
        List<Integer> arrayList = Arrays.asList(arr);
        solve(arrayList);

    }


}
