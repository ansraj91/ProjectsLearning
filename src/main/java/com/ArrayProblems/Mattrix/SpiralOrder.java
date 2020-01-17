package com.ArrayProblems.Mattrix;

import java.util.ArrayList;
import java.util.List;

public class SpiralOrder {

    public static ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> A) {

        int top = 0;
        int left = 0;
        int bottom = A.size()-1;
        int right = A.get(0).size()-1;
        ArrayList<Integer> spiralResult = new ArrayList <>();

        if(right==0){
            for(int i=top;i<=bottom;i++) spiralResult.add(A.get(i).get(0));

            return spiralResult;
        }
        if(bottom==0){
            for(int i=left;i<=right;i++) spiralResult.add(A.get(0).get(i));

            return spiralResult;
        }

        while(top <=bottom  && left <=right){

            if(top<=bottom) {
                for (int j = left; j <= right; j++) {
                    spiralResult.add(A.get(top).get(j));
                }
                top++;
            }
            //left++;

            if(left<=right){
                for(int i=top;i<=bottom;i++){
                    spiralResult.add(A.get(i).get(right));
                }
                right--;
            }

            //top++;
            if(top<=bottom){
                for(int j=right;j>=left;j--){
                    spiralResult.add(A.get(bottom).get(j));
                }
                bottom--;
                //right--;

            }


            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    spiralResult.add(A.get(i).get(left));
                }
                left++;
            }

           // bottom--;




        }

        return spiralResult;


    }

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> a= new ArrayList <>();
        a.add(new ArrayList <>());
        a.add(new ArrayList <>());
        a.add(new ArrayList <>());

        a.get(0).add(5);
        a.get(0).add(7);
        a.get(0).add(6);
        a.get(0).add(3);
        a.get(0).add(1);

        a.get(1).add(1);
        a.get(1).add(5);
        a.get(1).add(6);
        a.get(1).add(4);
        a.get(1).add(1);


        a.get(2).add(8);
        a.get(2).add(9);
        a.get(2).add(2);
        a.get(2).add(0);
        a.get(2).add(1);

        SpiralOrder.spiralOrder(a).stream().forEach(s->System.out.print(s));
    }
}
