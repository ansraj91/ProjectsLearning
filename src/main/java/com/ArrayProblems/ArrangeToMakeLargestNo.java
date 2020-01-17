package com.ArrayProblems;

import java.util.*;
import java.util.stream.Collectors;

import static java.lang.Integer.valueOf;

public class ArrangeToMakeLargestNo {


    public static void arrangeToMakeLargestNumberFromGivenSet(int arr[]){


        Comparator<String> comp = (X,Y)->{

            String XY = X+Y;
            String YX = Y+X;

            return XY.compareTo(YX);

        };

        List<String> list =  Arrays.stream(arr).mapToObj(String::valueOf).collect(Collectors.toList());
        Collections.sort(list,comp.reversed());

        list.stream().forEach(System.out::print);

    }

    public static void main(String[] args) {

        int arr[] = {548,54,60,612,34};

        ArrangeToMakeLargestNo.arrangeToMakeLargestNumberFromGivenSet(arr);
    }


}
