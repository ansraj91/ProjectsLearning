public class HeapSort {

    public static void sink(int arr_size, int arr[], int k) {
        while(k<arr_size){
            int j = k*2+1;
            if((j+1)<arr_size && arr[j]<arr[j+1]) j++;
            if(j<arr_size && arr[k] < arr[j]) {
                excahnge(arr,k,j);

            }
            k=j;
        }


    }
    public static void swim(int arr[], int k){

        while(k>1){
            int j = k/2;
            if(arr[j]<arr[k]){
                excahnge(arr,j,k);
            }else{
                break;
            }
            k = j;
        }

    }

    static void  excahnge(int arr[], int i,int j){

    int temp = arr[j];
    arr[j] = arr[i];
    arr[i] = temp;
}



}
