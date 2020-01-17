package com.ArrayProblems.LargestSubarray;

public class KadaneAlgo_BiggestSum {


    public static int solve(int arr[]){

        int golabalMax = Integer.MIN_VALUE;
        int currentMax = Integer.MIN_VALUE;
        int len = arr.length;
        for(int i=0;i<len;i++){
                currentMax = Math.max(arr[i], currentMax + arr[i]);
                if(currentMax > golabalMax){
                    golabalMax  = currentMax;
                    //System.out.println(arr[i]);
                }

        }

        return golabalMax;
    }


    public static void main(String str[]){

        int arr[] = {1,-2,3,4,-5,8};

        System.out.println(solve(arr));



    }



}
