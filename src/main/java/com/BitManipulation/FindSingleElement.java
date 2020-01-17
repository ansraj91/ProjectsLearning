package com.BitManipulation;

public class FindSingleElement {

    public static int solve(int arr[]){
        int x = Math.abs(arr[0]);
        for(int i=1;i<arr.length;i++){
            x ^=Math.abs(arr[i]);
        }

        return x;
    }


    public static void main(String str[]){
        int arr[] = {1, 2, 2, 3, 3,1,4};

        System.out.println(solve(arr));
    }
}
