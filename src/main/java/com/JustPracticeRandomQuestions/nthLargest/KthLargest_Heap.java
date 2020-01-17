package com.JustPracticeRandomQuestions.nthLargest;

import java.util.Arrays;

public class KthLargest_Heap {
    static int  arr[] = {1, 23, 12, 9, 30, 2, 50};
    static int nthGreatestElement = 3;

   static int length = arr.length;

    public static void main(String str[]){
        MaxHeap maxHeap= new MaxHeap();
        for(int i=length/2;i>=0;i--){
            maxHeap.sink(arr,length,i);
        }

        Arrays.stream(arr).forEach(i->System.out.print(" "+i));

        for(int i=0;i<nthGreatestElement;i++){
            System.out.println("\n" + arr[0]);
            length = length-1;
            maxHeap.exchange(arr,0,length);
            maxHeap.sink(arr,length,0);
        }
    }


}

