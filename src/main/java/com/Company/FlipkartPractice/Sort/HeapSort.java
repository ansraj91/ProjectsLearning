package com.Company.FlipkartPractice.Sort;

public class HeapSort {
    static int len = 7;
    public static void swimMin(int pos, int arr[]){

        int k = pos/2;
        while(k >= 0 && arr[pos] <arr[k]){
           exchange(arr, pos, k);
           pos=k;
        }


    }

    public static void sink(int pos, int arr[]){

        while(2*pos<=len) {
            int j = pos*2;
            if (j<len&&arr[j] > arr[j + 1]) j++;
            if (arr[j] < arr[pos]) {
                exchange(arr, pos, j);

            }
            pos = j;
        }
    }


    public static void exchange(int arr[], int i1, int i2){
        int tem = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = tem;
    }

    public static void main(String[] args) {
        int arr[] = {4,5,3,2,1,5,6};
        System.out.println(delMin(arr));

    }

    public static int delMin(int arr[]){
        sink(0,arr);
        int element = arr[0];
        arr[0] = arr[len-1];
        len--;
        sink(0,arr);
        return element;
    }

}
