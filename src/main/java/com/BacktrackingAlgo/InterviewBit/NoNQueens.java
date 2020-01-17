package com.BacktrackingAlgo.InterviewBit;

import java.util.ArrayList;

public class NoNQueens {

    public  ArrayList<ArrayList<String>> solve(int n){
        String arr[][] = new String [n][n];

        //arr[0][0] = 1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = ".";
            }
        }
        ArrayList<ArrayList<String>> res = new ArrayList<>();
        putQeens(arr,0,n,res);

        return res;

    }

    public  boolean putQeens(String arr[][], int j,int n, ArrayList<ArrayList<String>> res){
        if(j==n){
            putToArrayList(arr,res);
            return true;
        }


        for(int i=0;i<n;i++){

            if(isValidPos(arr,n,i,j)){
                arr[i][j] = "Q";
                putQeens(arr,j+1,n,res);// return true;
                arr[i][j] = ".";
            }

        }

        return false;

    }

    public static void print(String arr[][]){
        System.out.println();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int i1 = 0;
    public static void putToArrayList(String arr[][], ArrayList<ArrayList<String>> al) {
        al.add(new ArrayList <String>());
        for (int i =0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                al.get(i1).add(arr[i][j]);
            }

        }
        i1++;
    }



    public  boolean isValidPos(String arr[][],int n, int i, int j){
        if(i>=n || j>=n || i<0 || j<0) return false;


        for(int j1= j;j1>=0;j1--){
            if(arr[i][j1] == "Q") return false;
        }
        for(int i1=i,j1=j; i1>=0&&j1>=0; i1--,j1--){
            if(arr[i1][j1]== "Q" ) return false;
        }
        for(int i1=i,j1=j;i1<n&&j1>=0;i1++,j1--){
            if(arr[i1][j1]=="Q" ) return false;
        }

        return true;

    }

    public static void main(String[] args) {
        NoNQueens noNQueens = new NoNQueens();
        noNQueens.solve(4).forEach(System.out::println);

    }


}
