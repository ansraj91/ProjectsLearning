package com.ArrayProblems;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxSumArray {
    public static ArrayList<Integer> maxset(ArrayList<Integer> A) {
        ArrayList<Integer> result = new ArrayList <>();
        ArrayList<Integer> maxSofarArr = new ArrayList <>();
        long maxSoFar=0;
        long maxSum = -1;

        for(int i=0;i<A.size();i++){

         if(A.get(i)>=0){
             maxSoFar+=A.get(i);
             maxSofarArr.add(A.get(i));
             if(maxSoFar>=maxSum ){
                 if(maxSoFar == maxSum && maxSofarArr.size() > result.size()){
                     result.clear();
                     result.addAll(maxSofarArr);
                     maxSum = maxSoFar;
                 }else if(maxSoFar > maxSum){
                     result.clear();
                     result.addAll(maxSofarArr);
                     maxSum = maxSoFar;
                 }

             }

         }else{
             maxSofarArr.clear();
             maxSoFar = 0;

         }



        }

        return result;


    }

    public static void main(String[] args) {
        Integer i[] = {1, 2, 5, -7, 2, 5 };
        ArrayList<Integer> arr = new ArrayList <>();
        arr.addAll(Arrays.asList(i));
        MaxSumArray.maxset(arr).stream().forEach(s->System.out.println(s+" "));
    }
}
