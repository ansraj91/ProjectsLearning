package com.ArrayProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class PascalsTriangle {


   // Stack<Integer> s1 = new Stack();
    static int arr[][];

/*    public static void solve(int x){
        arr = new int[x][x];
      // s1.push(1);
        for(int line=0;line<x;line++){
            for(int i=0;i<=line;i++){
                if(i==0 || line==i){
                    arr[line][i] = 1;
                }else {
                    arr[line][i] = arr[line - 1][i - 1] + arr[line - 1][i];
                }
                System.out.print(arr[line][i] + " ");
            }
            System.out.println();

        }
    }*/

    public static ArrayList<ArrayList<Integer>> solve(int A) {

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        Collections.sort(new ArrayList <String>());

        for(int line=0;line<A;line++){
            result.add(new ArrayList<Integer>());
            for(int i=0;i<=line;i++ ){
                if(i==0 || i==line){
                    result.get(line).add(1);
                }else{
                    result.get(line).add(i,(result.get(line-1).get(i-1)+result.get(line-1).get(i)));
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        //solve(5);
        System.out.println(solve(5).toString());

    }


}
