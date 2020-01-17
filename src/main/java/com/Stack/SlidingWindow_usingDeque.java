package com.Stack;

import java.util.*;

public class SlidingWindow_usingDeque {

    public ArrayList<Integer> slidingMaximum(final List<Integer> A, int B) {

        ArrayList<Integer> result = new ArrayList <>();

        Deque<Integer> Q = new LinkedList <>();

        int i=0;
        for(i=0;i<B;++i){
            while(!Q.isEmpty() &&A.get(i)>=A.get(Q.peekLast()))
                Q.removeLast();

            Q.addLast(i);

        }
        for(;i<A.size();i++){
            result.add(A.get(Q.peek()));

            while(!Q.isEmpty() &&Q.peek()<=(i-B))
                Q.removeFirst();

            while(!Q.isEmpty() &&A.get(i)>=A.get(Q.peekLast()))
                Q.removeLast();

            Q.addLast(i);



        }

        result.add(A.get(Q.peek()));

        return result;
    }

    public static void main(String[] args) {
        SlidingWindow_usingDeque sl = new SlidingWindow_usingDeque();
        Integer arr[] ={1, 3, -1, -3, 5, 3, 6, 7};
        List l = Arrays.asList(arr);
        sl.slidingMaximum(l,3).forEach(System.out::println);
    }
}
