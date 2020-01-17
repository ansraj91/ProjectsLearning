import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    static int arr[];

    public static void main(String[] args) {

        HeapSort heapSort = new HeapSort();
        arr = new int[]{23, 4, 5, 1, 66, 78, 8};
        int length = arr.length;

        for(int i=length/2;i>=0;i--){
            heapSort.sink(length,arr,i);
        }
        Arrays.stream(arr).forEach(i->System.out.print(i+" "));
        for(int i=0;i<3;i++){
            System.out.println("\n"+(i+1)+" Highest: " +arr[0]);
            length = length-1;
            heapSort.excahnge(arr,0,length);
            heapSort.sink(length,arr,0);


        }



    }



}
