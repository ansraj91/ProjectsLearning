package com.Rehersal.DP;

public class LongestIncreasingSubSeq {

    int arr[];

    LongestIncreasingSubSeq(int arr[]){
        this.arr = arr;
    }

    public int solve(int arr[], int i, int n, int prev){

        if(i==n) return 0;
        int exl = solve(arr,i+1,n,prev);
        int incl = 0;
        if(arr[i]>prev){
            incl = 1+solve(arr,i+1,n,arr[i]);
        }

        return Math.max(incl,exl);
    }

    public static void main(String[] args) {
        int[] A=  {0,8,12,2,10,6,14,1,9,5,13,3,11,7,15};
        LongestIncreasingSubSeq longestIncreasingSubSeq = new LongestIncreasingSubSeq(A);
        System.out.println(longestIncreasingSubSeq.solve(A,0,A.length,Integer.MIN_VALUE));
    }



}
