package com.DynamicProgramming.LongestIncreasingSubsequance;

/*++++++++++++++Problem Statement+++++++++++++++++++++++++++++++
The Longest Increasing Subsequence (LIS) problem is to find the length of the longest subsequence of a given sequence such that all elements of the subsequence are sorted in increasing order. For example, the length of LIS for {10, 22, 9, 33, 21, 50, 41, 60, 80} is 6 and LIS is {10, 22, 33, 50, 60, 80}.
Input  : arr[] = {3, 10, 2, 1, 20}
Output : Length of LIS = 3
The longest increasing subsequence is 3, 10, 20

Input  : arr[] = {3, 2}
Output : Length of LIS = 1
The longest increasing subsequences are {3} and {2}

Input : arr[] = {50, 3, 10, 7, 40, 80}
Output : Length of LIS = 4
The longest increasing subsequence is {3, 7, 40, 80}


 */

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class Solution {


    public static boolean xGreaterOrEqulsToY(int x, int y) {
        return x >= y;
    }

    public static BiPredicate <Integer, Integer> biPredicate = Solution::xGreaterOrEqulsToY;

    public static Function <int[], Integer> functionOperator = Solution::apply1;

    private static Integer apply1(int[] ls) {
        int resultList[] = new int[ls.length];
        for (int i = 0; i < ls.length; i++) {
            resultList[i] = 1;
        }
        for (int i = 1; i < ls.length; i++) {
            if (biPredicate.test(ls[i], ls[i - 1])) {
                resultList[i] = resultList[i - 1] + 1;
            } else resultList[i] = resultList[i - 1];
        }
        return resultList[ls.length - 1];
    }


    public static void main(String[] args) {
        int[] list = {13285, 17364, 18833, 12272, 3454, 7300, 11089};

        System.out.println(functionOperator.apply(list));


    }
}

