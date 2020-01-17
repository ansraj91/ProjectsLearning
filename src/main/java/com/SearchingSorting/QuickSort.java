package main.java.com.SearchingSorting;

import java.util.Arrays;

public class QuickSort {

    static int[] quickSort(int[] arr) {

        new QuickSort().quickSort(arr, 0, arr.length-1);
        return arr;


    }


    public void quickSort(int arr[], int lo, int hi){

        if(lo < hi){

            int part = partition(arr, lo, hi);

            quickSort(arr,lo,part-1);
            quickSort(arr, part+1, hi);


        }




    }

    public int partition(int arr[], int lo, int hi){
        int pivot = arr[lo];
        int i=lo;
        int j=hi+1;

        while(true){
            while(arr[++i]<pivot){
                if(i==hi) break;
            };
            while(arr[--j]>pivot){
                if(j==lo) break;
            }

            if(i>=j) break;

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        }
        int temp = arr[lo];
        arr[lo] = arr[j];
        arr[j] = temp;
        return j;
    }


    public static void main(String[] args) {
        int arr[] = {2,3,4,1,5,0};
        //2,0,4,1,5,3 i=1 , j=5
        //2,0,1,4,5,3 i=2 , j=3
        //1,0,2,4,5,3 part = 2
        //1,0,2 i =1 , j=1
        //0,1,2 part = 1
        //0,1


        Arrays.stream(QuickSort.quickSort(arr)).forEach(System.out::print);
    }

}
