package com.SearchingSorting;

import java.util.ArrayList;
import java.util.Arrays;

public class KthElementHeapsort {



    public static void sink(int arr[], int arr_size){
        int k = 0;
        while(k<arr_size){
            int j = k*2+1;
            if((j+1)<arr_size && arr[j]>arr[j+1]) j++;
            if(j<arr_size && arr[k] > arr[j]) {
                excahnge(arr,k,j);

            }
            k=j;
        }





    }

    public static void swim(int arr[], int k){

        while(k>=1){
            int j = k/2;
            if(arr[j]>arr[k]){
                excahnge(arr,j,k);
            }else{
                break;
            }
            k = j;
        }

    }
   static int curr_ele = 0;
    static int arr_len = 10;
   static  int arr[] = new int[arr_len];

    public static void insert(int element){
        arr[curr_ele] = element;
        swim(arr,curr_ele);
        curr_ele++;

    }

    public static int remove_min(){

        int temp = arr[0];
        arr[0] = arr[curr_ele-1];
        arr[curr_ele] = temp;
        --curr_ele;
        sink(arr,curr_ele);
        return arr[curr_ele+1];
    }

    static void  excahnge(int arr[], int i,int j){

        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
    public static void main(String[] args) {
        insert(5);
        insert(10);
        insert(3);
        insert(5);
        insert(9);
        for(int o =0; o<curr_ele;o++) System.out.println(arr[o]);

        System.out.println("max"+remove_min());
        for(int o =0; o<curr_ele;o++) System.out.println(arr[o]);
        System.out.println("max"+remove_min());
        System.out.println("max"+remove_min());
        System.out.println("max"+remove_min());
        System.out.println("max"+remove_min());

    }


}
