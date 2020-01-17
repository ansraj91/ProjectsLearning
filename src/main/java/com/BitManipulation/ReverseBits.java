package com.BitManipulation;

import java.math.BigInteger;

public class ReverseBits {

    public static long reverse(long a){
       long rev =0 ;
       while(a>0){

           rev <<= 1;

           // if current bit is '1'
           if ((a & 1) == 1)
               rev ^= 1;

           // bitwise right shift
           //'n' by 1
           a >>= 1;

       }

       return rev;
    }




    public static void main(String[] args) {
        System.out.println(reverse(1));

        System.out.println( String.format("%032d", new BigInteger(Long.toBinaryString((long)1))));

        System.out.println( String.format("%032d", new BigInteger(Long.toBinaryString((long)reverse(1)))));
    }






}
