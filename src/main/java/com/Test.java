package com;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        int A[] = {2,4,5,3,1,6};

        System.out.println(solve(6,A,1,6));
        System.out.println();
        System.out.println(solve(6,A,2,4));
        System.out.println();
        System.out.println(solve(6,A,3,3));

    }

    static int solve(int N, int[] A, int L, int R) {
        //Your code goes here
        int tempLen = (R+L)-1;
        //int[] temp = new int[tempLen];
        //temp = Arrays.copyOfRange(A, L-1, R);
        int tem[] = Arrays.copyOfRange(A, L-1, R);
        Arrays.sort(tem,L-1,R);
        // if(tempLen%2 == 0) tempLen--;
        for (int i: A) System.out.print(i + " ");
        System.out.println();
        if(tempLen%2 ==0)tempLen--;
        return tem[tempLen/2];

    }
}
