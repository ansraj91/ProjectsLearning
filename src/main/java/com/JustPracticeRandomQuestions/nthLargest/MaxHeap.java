package com.JustPracticeRandomQuestions.nthLargest;

public class MaxHeap {


    public void sink(int arr[],int length, int k){

        while(k<length){
            int j = k*2+1;
            if((j+1)<length && arr[j]<arr[j+1])j++;
            if(j<length && arr[k]<arr[j]){
              exchange(arr,j,k);
            }
            k=j;

        }

    }


    public void swim(int arr[], int pos){

        while(pos>1){

            int j = pos/2;
            if(arr[j]<arr[pos]){
                exchange(arr,j,pos);
            }else{
                break;
            }

            pos = j;

        }





    }


    public void exchange(int arr[], int j, int k){

        int temp = arr[j];
        arr[j] = arr[k];
        arr[k] = temp;
    }

}
