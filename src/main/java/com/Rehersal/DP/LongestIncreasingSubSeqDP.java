package com.Rehersal.DP;

import java.util.Arrays;

public class LongestIncreasingSubSeqDP {

    int result[];
    int arr[];

    LongestIncreasingSubSeqDP(int arr[]){
        this.arr = arr;
        result = new int[arr.length];
        result[0] = 1;
    }


    public void solve(){
        for(int i=1;i<arr.length;i++){
            for(int j=0;j<i;j++){
                if(arr[i]>arr[j] && result[j]>result[i]){
                    result[i] = result[j];
                }
            }
            Arrays.stream(result).forEach(System.out::print);
            System.out.println();
            result[i]++;
        }
    }


    public int getResult(){
        return Arrays.stream(result).max().getAsInt();
    }

    public static void main(String[] args) {
        int arr[] = {0,8,12,2,10,6,14,1,9,5,13,3,11,7,15};
        LongestIncreasingSubSeqDP longestIncreasingSubSeqDP  = new LongestIncreasingSubSeqDP(arr);
        longestIncreasingSubSeqDP.solve();
        System.out.println(longestIncreasingSubSeqDP.getResult());


    }


}
