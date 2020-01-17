package com.JustPracticeRandomQuestions.AlmostSorted;

public class AlmostSorted {

    static void almostSorted(int[] arr) {
        int len = arr.length;
       int dipup[]  = new int[len-1];
       int k1 = -1,k2 = -1;
       boolean swap = false;
       boolean reverse = false;
       boolean notPossible = false;
       boolean continious = true;
       String result;

       for(int i=1;i<len;i++){
           if(arr[i-1]>arr[i]){
               if(k1==-1){
                   k1 = i-1;
               }
               dipup[i-1] = 0;
           }else{
               dipup[i-1] = 1;
           }
       }

       for(int i=k1+1;i<len-1;i++){
           k2=k1;
           if(arr[i] == 0){
               if(i-k2==1) {
                   k2 = i;
                   continue;
               }else if(k2==k1){
                   k2=i;
                   break;
               }


           }

       }

       if((k1-k2)==0){
           notPossible = true;
       }else if(k2-k1 == 1){

           if(isSorted(arr)){
               result = "swap " + k1 + " "+k2;
           }else{
               result ="no";
           }
       }else{

           reverse(arr,k1,k2);
           if(isSorted(arr)){
               result ="reverse " + k2 + " "+ k1;
           }else{
               result ="no";
           }

       }






    }

    public static void reverse(int arr[],int l1, int l2){

        for(int i=0,j=l2;i<arr.length/2 && j>i;i++,j--){
            int temp = arr[i];
            arr[j] = arr[i];
            arr[i] = temp;
        }
    }

    static boolean isSorted(int arr[]){
        for(int i=1;i<arr.length;i++) {
            if(!(arr[i-1]<arr[i])) {
                return false;
            }
        }

        return true;
    }
}
