package com.Recursion;

import java.util.Arrays;

public class BinaryNumber {

    static int counter = 0;
    static int arr[] = new int[3];
    static String result="";
    public static String calcultateBinary(int n){
        System.out.println("Value of n:" + n);
        if(n==0){
            result =  "0"+result;
            //counter++;

            return result;
        }if(n==1){
            result = "1"+result;
            //counter++;
            return result;
        }
        result = calcultateBinary(n/2)+n%2;
        return result;




    }


    public static void main(String[] args) {

        System.out.println(calcultateBinary(10));
        //Arrays.stream(arr).forEach(System.out::println);
    }

}
