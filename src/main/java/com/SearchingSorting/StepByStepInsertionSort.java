package main.java.com.SearchingSorting;

public class StepByStepInsertionSort {

    // Complete the insertionSort1 function below.
    static void insertionSort1(int n, int[] arr) {
        boolean output = false;

     int temp = arr[n-1];
            for(int j=n-1;j>0;j--){
                if(temp<arr[j-1]){
                    arr[j] = arr[j-1];

                }else{
                    arr[j-1] = temp;
                  output  = true;
                    break;

                }

                for(int i =0;i<n;i++){
                    System.out.print(arr[i] + " ");
                }
                System.out.println();

            }

        if(!output){
            arr[0] = temp;

        }

        for(int i =0;i<n;i++){
            System.out.print(arr[i] + " ");
        }



    }

    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6,7,8,9,10,1};
        StepByStepInsertionSort.insertionSort1(arr.length,arr);
    }


}
