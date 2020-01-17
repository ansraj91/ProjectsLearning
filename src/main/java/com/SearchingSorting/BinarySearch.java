package main.java.com.SearchingSorting;

import java.math.BigInteger;

public class BinarySearch {


    // Complete the introTutorial function below.
    static int introTutorial(int V, int[] arr) {

        int start = 0;
        int end = arr.length;
        int mid = (end + start)/2;

        while(start < end){
            if(V==arr[mid]) return mid;
            if(V<arr[mid]){
                end =mid-1;
                mid = (end+start)/2;
            }else{
                start = mid+1;
                mid = (end+start)/2;
            }
        }

        return -1;

    }

    public static void main(String[] args) {

        int arr[] = {1,3,5,7,9,11,13,15,17,19,21,23};
        int indexOf = 23;

        System.out.println(BinarySearch.introTutorial(indexOf,arr));

    }
}
