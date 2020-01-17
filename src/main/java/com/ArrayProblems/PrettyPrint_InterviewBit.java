package com.ArrayProblems;

import java.util.ArrayList;

public class PrettyPrint_InterviewBit {


    public static void main(String sr[]){

        int x = 4;

        int n = (x*2)-1;
        int z=x;
        int top = 0;
        int left = 0 ;
        int bottom = n-1;
        int right = n-1;

        ArrayList<ArrayList<Integer>> al = new ArrayList <>();
        ArrayList<Integer> s = new ArrayList <>();

        s.add(112);



        for(int i=0;i<n; i++){
            al.add(new ArrayList <>());
            for (int j=0;j<n;j++){
                al.get(i).add(0);
            }
        }
        for (ArrayList a: al){
            System.out.println(a.toString());
        }
        System.out.println(al.size());
        int arr[][] = new int[n][n];

        while(z>0){
            for(int i=left;i<=right;i++){
                arr[top][i] = z;
                al.get(top).set(i,z);
            }
            top++;

            for(int i=top;i<=bottom;i++){
                arr[i][right]=z;
                al.get(i).set(right,z);
            }
            right--;

            for(int i=right;i>=left;i--){
                arr[bottom][i] = z;
                al.get(bottom).set(i,z);

            }
            bottom--;
            for(int i=bottom;i>=top;i--){
                arr[i][left] = z;
                al.get(i).set(left,z);

            }
            left++;
            z--;
        }

        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print(arr[i][j] +" ");
            }

            System.out.println();
        }

        for (ArrayList a: al){
            System.out.println(a.toString());
        }

    }
}
