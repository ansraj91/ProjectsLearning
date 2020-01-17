package com.Sort;

/*
* Given an array of integers, determine whether the array can be sorted in ascending order using only one of the following operations one time.

Swap two elements.
Reverse one sub-segment.
Determine whether one, both or neither of the operations will complete the task. If both work, choose swap. For instance, given an array  either swap the  and , or reverse them to sort the array. Choose swap. The Output Format section below details requirements.

Function Description

Complete the almostSorted function in the editor below. It should print the results and return nothing.

almostSorted has the following parameter(s):

arr: an array of integers
Input Format

The first line contains a single integer , the size of .
The next line contains  space-separated integers  where .
* */
public class AlmostSort {

    static void almostSorted(int[] arr) {
        int len = arr.length;

        int monitorArr[] = new int[len];

        int p1 = -1;
        int p2 = -1;

        for(int i=0;i<len-1;i++){

            if(arr[i] > arr[i+1]){
                monitorArr[i] = 1;
            }

        }


        for(int i=0;i<len;i++){
            if(monitorArr[i]==0 && p1==-1){
                continue;
            }
            if(monitorArr[i] == 1 && p1==-1){
                p1=i;
                continue;
            }

            if(monitorArr[i] ==1 && p1 !=-1){
                p2 = i;
                continue;
            }

            if(arr[i] ==0 && p2==-1 ){
                continue;
            }

            if(arr[i] ==0 && p2!=-1){
                break;
            }



        }


        if(p1!=-1 && p2==-1){

            swap(arr,p1,p1+1);

            if(!isSorted(arr)){
                System.out.println("no");
                return;
            }
            System.out.println("yes");
            System.out.println("swap "  + (p1+1) + " " + (p1+1+1));

            return;

        }
        if(p2 == p1+1){
            swap(arr,p1,p2);

            if(!isSorted(arr)){
                System.out.println("no");
                return;
            }
            System.out.println("yes");
            System.out.println("swap "  + (p1+1) + " " + (p2+1));
            return;
        }

        if(monitorArr[p1+1] == 0 && p2!=-1){
            swap(arr,p1,p2);
            if(!isSorted(arr)){
                System.out.println("no");
                return;
            }
            System.out.println("yes");
            System.out.println("swap "  + (p1+1) + " " + (p2+1));
            return;
        }

        if(p1!=-1 && p2!=-1){

            reverse(arr,p1,p2+1);
            if(!isSorted(arr)){
                System.out.println("no");
                return;
            }
            System.out.println("yes");
            System.out.print("reverse "  + (p1+1) + " " + (p2+2));
            return;
        }

        if(!isSorted(arr)){
            System.out.println("no");
            return;
        }




    }


    public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverse(int arr[], int k, int l){

        int j = k;
        int arr_r[] = new int[l-k + 1];
        for(int i=0;i<arr_r.length;i++){
            arr_r[i] = arr[j++];



        }

        for(int i=arr_r.length-1;i>=0;i--){
            arr[k] = arr_r[i];
            k++;
        }

    }
    public static boolean isSorted(int a[]){
        for (int i = 0; i < a.length-1; i++) {
            if (a[i] < a[i + 1]) {
               continue;
            }
            else {
                return false;
            }
        }

        return true;
    }

    public static void main(String str[]){
        int arr[] = {1,5,4,3,2,6};
        almostSorted(arr);

    }


}
