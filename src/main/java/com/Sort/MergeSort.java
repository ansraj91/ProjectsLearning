package com.Sort;

import java.util.Arrays;

public class MergeSort {

    public void sort(int arr[], int aux[],int start, int end){
        if(start<end){
            int mid = (end+start)/2;
            sort(arr,aux,start,mid);
            sort(arr,aux,mid+1,end);
            merge(arr, aux,start,mid,end);
        }



    }

    public void merge(int arr[], int aux[], int start, int mid, int end){
        for(int i=start;i<=end;i++){
            aux[i] = arr[i];
        }

        int i=start;
        int j=mid+1;
        int k =start;
        while(i<=mid && j<=end){
            if(aux[i]<=aux[j]){
                arr[k++] = aux[i++];
            }else{
                arr[k++] = aux[j++];
            }

        }
        while(i<=mid){
            arr[k++] = aux[i++];
        }

        while(j<=end){
            arr[k++] = aux[j++];
        }
    }

    public static void main(String[] args) {


        int arr[] = {1,5,4,3,2,6};
        int aux[] = new int[arr.length];
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(arr,aux,0,arr.length-1);
        Arrays.stream(arr).forEach(System.out::println);

    }




}
