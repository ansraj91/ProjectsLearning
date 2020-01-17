package com.ArrayProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveDuplicatesFromSortedArray {

    /*
    * Remove duplicates from Sorted Array
Given a sorted array, remove the duplicates in place such that each element appears only once and return the new length.

Note that even though we want you to return the new length, make sure to change the original array as well in place

Do not allocate extra space for another array, you must do this in place with constant memory.

 Example:
Given input array A = [1,1,2],
Your function should return length = 2, and A is now [1,2]
    * */

public static int solve(List<Integer> A){

    ArrayList<Integer > result = new ArrayList <>();
    int k = 0;
    for(int i=1;i<A.size();i++){
        if(A.get(i).equals( A.get(k)))  {
            continue;
        }
        A.set(++k,A.get(i));

    }




     return k+1;

}

    public static void main(String[] args) {
        Integer arr[] = {5000,5000,5000};
        List<Integer> al = Arrays.asList(arr);
        System.out.println(solve(al));
        System.out.println("--");
        al.stream().forEach(System.out::print);
    }


}
