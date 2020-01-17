package com.InterviewBit.Math;

import java.math.BigInteger;

public class SqrtUsingBinarySearch {


    public static int solve(int A){

        if(A==0 || A==1) return A;

        int start = 1;
        long end  = A;
        int ans = 0;
        while(start<=end){
            long mid = (start+end)/2;

            if(mid*mid == A) return (int)mid;
            //System.out.println(mid);
            if(mid*mid< A){
                start = (int)mid+1;
                ans = (int)mid;
            }else{
                end = mid-1;
            }
        }




        return ans;

    }


    public static void main(String[] args) {
        System.out.println(solve(3));
    }


}
