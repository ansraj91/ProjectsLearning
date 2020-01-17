package com.Sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class InsertionSort <T extends Comparable>{



    public void solve(T t[]){
        int len = t.length;


        IntStream.range(1,len).forEach(i->{
            IntStream.range(0,i).map(r->i-r).forEach(j-> {
                if ((t[j].compareTo(t[j - 1]) < 0)) {
                    T temp = t[j];
                    t[j] = t[j-1];
                    t[j-1] = temp;
                }

            });

        });



       for(int i=1;i<len;i++){
            for(int j=i;j>0;j--){
                if(t[j].compareTo(t[j-1])<0){
                    T temp = t[j];
                    t[j] = t[j-1];
                    t[j-1] = temp;
                }
            }
        }
    }


    public static void main(String[] args) {
        InsertionSort<Integer> str_sort = new InsertionSort <>();
        Integer arr[] = {5,4,3,2,1};

        str_sort.solve(arr);
        Arrays.stream(arr).forEach(s->System.out.println(s + "  " ));


    }



}
