package com.DynamicProgramming;

import java.util.Arrays;

public class NoWaysStairsClimb {


    public static  int solve(int n, int arr[]){

        if(n<=0) return 0;

        else if(n==1) return 1;

        else if(Arrays.asList(arr).contains(n)){
            int sum = 0;
            for(int x:arr){
                sum+=solve(n-x,arr);
            }

            return 1+sum;


        }else{
            int sum = 0;
            for(int x:arr){
                sum+=solve(n-x,arr);
            }
            return sum;

        }

    }

    public static void main(String[] args) {
        int arr[] = {1,3,5};
        System.out.println(solve(5+1,arr));
        Integer.parseInt("25");
    }



}
