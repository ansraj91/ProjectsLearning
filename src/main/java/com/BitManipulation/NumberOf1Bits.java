package com.BitManipulation;

public class NumberOf1Bits {

    public static int count1s(long a){
        int count  = 0;
        while(a!=0){
            System.out.println(a);
            a = a&(a-1);
            count++;
        }
        return count;
    }


    public static void main(String[] args) {
        System.out.println(count1s(1000000000));
    }
}
