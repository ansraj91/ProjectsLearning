package com.ArrayProblems;

public class DuplicatesIn1DArray {

    public static void solve(int arr[]){
        int len = arr.length;
        for(int i=0;i<len;i++){

            if(arr[Math.abs(arr[i])] > 0){
                arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
            }else{
               // arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
                System.out.print("Duplicate " + arr[i] + " ");
            }


        }


    }

    public static void main(String[] args) {
        int arr[] = {1,2,2,2,4,6,3,2,6};
        solve(arr);


    }


}
