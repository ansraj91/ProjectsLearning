package com.GS;

public class PositionalElements {

    public static int solve(int arr[][]){

        int minCol[] = new int [arr[0].length];
        int minRow[] = new int[arr.length];
        int maxCol[] = new int[arr[0].length];
        int maxRow[] = new int[arr.length];



        for(int i=0;i<arr.length;i++){
            int rowMin = Integer.MAX_VALUE;
            int rowMax = Integer.MIN_VALUE;
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]<rowMin){
                    rowMin = arr[i][j];
                }
                if(arr[i][j]>rowMax){
                    rowMax  = arr[i][j];
                }
            }
            minRow[i] = rowMin;
            maxRow[i] = rowMax;
        }

        for(int j=0;j<arr[0].length;j++){
            int colMin = Integer.MAX_VALUE;
            int colMax = Integer.MIN_VALUE;
            for(int i=0;i<arr.length;i++){
                if(arr[i][j]>colMax){
                    colMax = arr[i][j];
                }
                if(arr[i][j]<colMin){
                    colMin = arr[i][j];
                }
            }

            maxCol[j] = colMax;
            minCol[j] = colMin;
        }
        int posElements = 0;

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j] == maxCol[j] || arr[i][j] == minCol[j] || arr[i][j] == maxRow[i] || arr[i][j] == minRow[i]){
                    posElements++;
                }
            }
        }

        return posElements;

    }

    public static void main(String[] args) {
        int arr[][] = {{1, 1}, {1, 1}, {1, 1}};
        System.out.println(solve(arr));
    }
}
