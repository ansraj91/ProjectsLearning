package com.BitManipulation;

public class DivideNum {

    public static int solve(int A, int B){
        if(B<A){
            A= A>>B-1;
        }
        return A;
    }

    public static void main(String[] args) {
        System.out.println(solve(5,2));
    }
}
