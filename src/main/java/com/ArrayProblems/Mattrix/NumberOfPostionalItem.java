package com.ArrayProblems.Mattrix;

public class NumberOfPostionalItem {



    public static int solve(int arr[][]){
        int m = arr.length;
        int n = arr[0].length;
        int minNumInRow[]  = new int[m];
        int minNumInColumn[] = new int[n];
        int maxNumInRow[]  = new int[m];
        int maxNumInColumn[] = new int[n];

        //find min value row
        for(int i=0;i<m;i++){
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for(int j=0;j<n;j++){
                if(min>arr[i][j]){
                    min = arr[i][j];
                }
                if(max<arr[i][j]){
                    max = arr[i][j];
                }
            }
            minNumInRow[i]=min;
            maxNumInRow[i]=max;
        }
       // System.out.println(minNumInColumn);

        //find min value column
        for(int j=0;j<n;j++){
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for(int i=0;i<m;i++){
                if(min>arr[i][j]){
                    min = arr[i][j];
                }
                if(max<arr[i][j]){
                    max = arr[i][j];
                }
            }
            minNumInColumn[j]=min;
            maxNumInColumn[j]=max;
        }



        int count = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if((arr[i][j]==minNumInRow[i]) ||(arr[i][j] == maxNumInRow[i])||
                        (arr[i][j] == minNumInColumn[j])||(arr[i][j] == maxNumInColumn[j])
                        ) count++;

            }
        }

    return count;

    }

    public static void main(String[] args) {
        int arr[][] = {{ 1, 3, 4 },
        { 5, 2, 9 },
        { 8, 7, 6 }};

        System.out.println(solve(arr));

    }


}
