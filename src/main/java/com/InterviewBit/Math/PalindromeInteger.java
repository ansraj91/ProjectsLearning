package com.InterviewBit.Math;

import java.util.function.Predicate;

public class PalindromeInteger {


   public static int reverseNum(int num){

       int reversed = 0;
       while(num>=0){
           reversed = reversed*10 + (num%10);
           num = num/10;
       }

       return reversed;
   }

    public static void main(String[] args) {

        int num = 12121;
        System.out.println(Integer.reverse(num));
        if(reverseNum(num) == num)
            System.out.println("True");
        else
            System.out.println(false);




    }
}


class Solution {
    public int isPalindrome(int A) {

        if(reverseNum(A) == A)
            System.out.println("True");
        else
            System.out.println(false);

        return A;
    }

    public static int reverseNum(int num){

        int reversed = 0;
        while(num>=0){
            reversed = reversed*10 + (num%10);
            num = num/10;
        }

        return reversed;
    }


}
