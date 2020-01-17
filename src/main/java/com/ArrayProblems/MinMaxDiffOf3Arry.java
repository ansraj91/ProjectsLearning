package com.ArrayProblems;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinMaxDiffOf3Arry {

    /*
    Given three sorted arrays A, B and Cof not necessarily same sizes.

Calculate the minimum absolute difference between the maximum and minimum number from the triplet a, b, c such that a, b, c belongs arrays A, B, C respectively.
i.e. minimize | max(a,b,c) - min(a,b,c) |.
     */


    public static int solve(List<Integer> A, List<Integer> B, List<Integer> C){

        int i = A.size()-1;
        int j = B.size()-1;
        int k = C.size()-1;
        int maxTerm = 0;
        int minDiff = Math.abs(Math.max(A.get(i),Math.max(B.get(j),C.get(k)))-Math.min(A.get(i),Math.min(B.get(j),C.get(k))));
        int currDiff = 0;

        while (i>=0&&j>=0&&k>=0){
            currDiff = Math.abs(Math.max(A.get(i),Math.max(B.get(j),C.get(k)))-Math.min(A.get(i),Math.min(B.get(j),C.get(k))));

            if(currDiff<minDiff) minDiff = currDiff;

            maxTerm = Math.max(A.get(i),Math.max(B.get(j),C.get(k)));
            if(maxTerm == A.get(i)){
                i--;
            }else if(maxTerm == B.get(j)){
                j--;
            }else if(maxTerm == C.get(k)){
                k--;
            }
        }
        return minDiff;

    }

    public static void main(String[] args) {

        Integer A[] = { 1, 4, 5, 8, 10 };
        Integer B[] = { 6, 9, 15 };
        Integer C[] = {2, 3, 6, 6};

        List<Integer> l1 = Arrays.asList(A);
        List<Integer> l2 = Arrays.asList(B);
        List<Integer> l3 = Arrays.asList(C);

        System.out.println(solve(l1,l2,l3));
    }

}
