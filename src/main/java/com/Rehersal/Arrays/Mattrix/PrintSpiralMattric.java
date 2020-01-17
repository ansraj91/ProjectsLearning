package com.Rehersal.Arrays.Mattrix;

public class PrintSpiralMattric {


    public static  void solve(int arr[][]){
        int top=0;
        int left = 0;
        int bottom = arr.length-1;
        int right = arr[0].length-1;

        int i;

        while(top<=bottom &&left<=right){

            if(top<=bottom){
                for(i=left;i<=right;i++){
                    System.out.println(arr[top][i] +" ");
                }
                top++;
            }
            if(left<=right){
                for(i=top;i<=bottom;i++){
                    System.out.println(arr[i][right]+" ");
                }
                right--;
            }

            if(top<=bottom){
                for(i=right;i>=left;i--){
                    System.out.println(arr[bottom][i]+" ");
                }
                bottom--;
            }
            if(left<=right){
                for(i=bottom;i>=top;i--){
                    System.out.println(arr[i][left]+" ");
                }
                left++;
            }

            System.out.println();
        }


    }

    public static void main(String[] args) {

        int a[][] = { { 1, 2, 3, 4, 5, 6 },
                { 7, 8, 9, 10, 11, 12 },
                { 13, 14, 15, 16, 17, 18 } };
        solve(a);
    }


}
