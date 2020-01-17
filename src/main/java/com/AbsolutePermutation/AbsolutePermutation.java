package com.AbsolutePermutation;

import java.io.IOException;
import java.util.Arrays;
/*
* We define  to be a permutation of the first  natural numbers in the range . Let  denote the value at position  in permutation  using -based indexing.

 is considered to be an absolute permutation if  holds true for every .

Given  and , print the lexicographically smallest absolute permutation . If no absolute permutation exists, print -1.

For example, let  giving us an array . If we use  based indexing, create a permutation where every . If , we could rearrange them to :

pos[i]	i	|Difference|
3	1	2
4	2	2
1	3	2
2	4	2
Function Description

Complete the absolutePermutation function in the editor below. It should return an integer that represents the smallest lexicographically smallest permutation, or  if there is none.

absolutePermutation has the following parameter(s):

n: the upper bound of natural numbers to consider, inclusive
k: the integer difference between each element and its index
* */
public class AbsolutePermutation {


    static int[] absolutePermutation(int n, int k) {

        int result[] = new int[n];
        int d= 1;
        for(int i=0,j=0;i<n;i++,j++){

            if(j==k){
                j=0;
                d*=-1;

            }

            int value = i+1+k*d;
            if(value > n || value < 1) return new int[] {-1};

            result[i] = value;


        }
        return result;
    }


    public static void main(String str[]){
        Arrays.stream(absolutePermutation(10, 5)).forEach(System.out::println);
    }

}
