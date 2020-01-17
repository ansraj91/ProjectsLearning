package main.java.com.SearchingSorting;

public class CompleteInsertionSort {


    static void insertionSort2(int n, int[] arr) {
        for(int i=1;i<n;i++){

            for(int j=0;j<i;j++){
                if(arr[i]<arr[j]){
                    int emp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = emp;
                }
            }

            for(int k =0;k<n;k++){
                System.out.print(arr[k] + " ");
            }
            System.out.println();

        }


    }

    public static void main(String[] args) {
        int arr[] = {3,4,7,5,6,2,1};
        CompleteInsertionSort.insertionSort2(arr.length,arr);
    }

}
