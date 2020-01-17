package com.InterviewBit.Math;

public class SquareOrPower {


    public static long solve(int a, int b){

        if(b==0) return 1;
        if(b%2==0) {
            return solve(a,b/2)*solve(a,b/2);
        }else
            return a*solve(a,b/2)*solve(a,b/2);

    }

    public static long solvePowerModular(int A, int B, int C){
        if(B==0) return 1;
        if(B%2==0) return Math.floorMod(Math.floorMod(solvePowerModular(A,B/2,C),C)*Math.floorMod(solvePowerModular(A,B/2,C),C),C);
        return Math.floorMod(Math.floorMod(A,C)*Math.floorMod(solvePowerModular(A,B/2,C),C)*Math.floorMod(solvePowerModular(A,B/2,C),C),C);
    }

    public static void main(String[] args) {
        System.out.println(solve(5,3));
        System.out.println(solvePowerModular(2,3,3));
    }
}
