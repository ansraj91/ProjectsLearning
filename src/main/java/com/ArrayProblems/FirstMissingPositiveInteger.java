package com.ArrayProblems;

import java.util.ArrayList;

public class FirstMissingPositiveInteger {
    public static int solve(ArrayList<Integer> al){
        int arr[] = new int [al.size()];

        for(int i=0;i<al.size();i++){
            if(al.get(0)>0&& al.get(0)<al.size()){
                arr[al.get(i)] = 1;
            }
        }

        for(int i=1;i<al.size();i++){
            if(arr[i]==0) return i;
        }
        return -1;
    }
}
