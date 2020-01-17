package com.FraudulentActivity;

import java.util.Arrays;

public class FraudulentActivity {

    static int activityNotifications(int[] expenditure, int d) {
        int notify = 0;
        int limit = d;
        int len = expenditure.length;

        for(int i=0,j=d;j<len-1;i++,j++){
            int arr[]  = Arrays.copyOfRange(expenditure,i,j);
            int median = median(arr);
            if((2*median) <=expenditure[j]){
                notify++;
            }
        }

        return notify;


    }


    public static int medianNaive(int arr[]){
        Arrays.sort(arr);
        int len = arr.length;
        if(len%2 !=0){
            return arr[len/2];
        }else{
            int mid = len/2;
            int average = (arr[mid]+arr[mid+1])/2;
            return average;
        }
    }

    public static int median(int arr[]){
        int b[] = new int[arr.length];
        int max = -1;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        max = max+1;
       int count[] = new int[max];
        for(int i=0;i<arr.length;i++){
            count[arr[i]] = count[arr[i]]+1;
        }

        for(int i=1;i<max;i++ ){
            count[i]= count[i] + count[i-1];
        }

        for(int i=0;i<arr.length;i++){
            b[count[arr[i]]-1] = arr[i];
            count[arr[i]]--;
        }

        if (arr.length % 2 != 0)
           return b[arr.length/2];
        else
            return  (b[(arr.length-1)/2] +
                    b[(arr.length/2)])/2;

    }

    public static void main(String[] args) {
        int arr[] = {2,3,4,2,3,6,8,4,5};
        activityNotifications(arr,5);
    }


}
