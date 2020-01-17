package com.GS;

import java.util.Arrays;

public class MinNumReqPltfrm {
    //Source: https://www.geeksforgeeks.org/minimum-number-platforms-required-railwaybus-station/
    /*Given arrival and departure times of all trains that reach a railway station, the task is to find the minimum number of platforms required for the railway station so that no train waits.
    We are given two arrays which represent arrival and departure times of trains that stop

    Examples:

    Input: arr[] = {9:00, 9:40, 9:50, 11:00, 15:00, 18:00}
    dep[] = {9:10, 12:00, 11:20, 11:30, 19:00, 20:00}
    Output: 3
    There are at-most three trains at a time (time between 11:00 to 11:20)*/


    public static int solve(int arr[], int[] dep){

        Arrays.sort(arr);
        Arrays.sort(dep);

        int platformNeeded = 1;
        int result = 1;

        int i=1;
        int j=0;

        while(i<arr.length && j<arr.length){

            if(arr[i]<=dep[j]){
                platformNeeded++;
                i++;
                if(platformNeeded>result) result = platformNeeded;
            }else{
                platformNeeded--;
                j++;
            }

        }

        return result;



    }

    public static void main(String[] args) {
        int arr[] = {900, 940, 950, 1100, 1500, 1800};
        int dep[] = {910, 1200, 1120, 1130, 1900, 2000};
        System.out.println(solve(arr,dep));


    }



}
