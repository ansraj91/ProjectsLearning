package com.JustPracticeRandomQuestions.NonDisibleSubset;

import java.util.Arrays;

public class NonDisibleSubset {

    static int nonDivisibleSubset(int k, int[] S) {

        int rem[] = new int[k];
        Arrays.fill(rem,0);
        int maximumSubset = 0;

        for(int v: S){
            rem[v%k] +=1;
        }

        if(k%2==0){
            rem[k/2] = Math.min(rem[k/2],1);
        }
        maximumSubset = Math.min(rem[0],1);

        for(int i=1;i<=k/2;i++){
            maximumSubset+=Math.max(rem[i],rem[k-i]);
        }

        return maximumSubset;

    }


    public static void main(String str[]){

        int arr[] = {278,576,496,727,410,124,338,149,209,702,282,718,771,575,436};
        int num = 7;
        int count = NonDisibleSubset.nonDivisibleSubset(7,arr);

        System.out.println(count);


    }
}
