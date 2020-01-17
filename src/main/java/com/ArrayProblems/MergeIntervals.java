package com.ArrayProblems;

/*
* Given a collection of intervals, merge all overlapping intervals.

For example:

Given [1,3],[2,6],[8,10],[15,18],

return [1,6],[8,10],[15,18].

Make sure the returned intervals are sorted.
*/

import java.lang.reflect.Array;
import java.util.*;

public class MergeIntervals {
    static class Interval{

        int start;
        int end;

        Interval(int start,int end){
            this.start = start;
            this.end = end;
        }



    }

    public static Comparator<Interval> c = (a,b)->a.start-b.start;
    public static void solve(Interval arr[]){
        Arrays.sort(arr, c);

        Stack<Interval> s1 = new Stack <>();
        s1.push(arr[0]);
        for(int i=1;i<arr.length;i++){
            Interval top = s1.peek();

            if(top.end<arr[i].start){
                s1.push(arr[i]);
            }else{
                if(top.end<arr[i].end){
                    top.end = arr[i].end;
                    s1.pop();
                    s1.push(top);
                }
            }
        }
        while (!s1.isEmpty()){
            Interval p = s1.pop();
            System.out.println("["+p.start+","+p.end+"]");
        }
    }






    public static void main(String[] args) {
        Interval arr[]=new Interval[6];
        arr[0]=new Interval(1,5);
        arr[1]=new Interval(3,7);
        arr[2]=new Interval(4,6);
        arr[3]=new Interval(6,8);
        arr[4]=new Interval(10,12);
        arr[5]=new Interval(11,15);
        solve(arr);
    }

}
