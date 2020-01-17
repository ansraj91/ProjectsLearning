package com.Recursion;

public class GenerateBinaryAsNoOfCounts {

    public static void generateBinary(int n, String result){

        if(n==1){
            System.out.println(result);
        }else{
            if(result.charAt(result.length()-1) !='1'){
                generateBinary(n-1, result+"1");
            }
            generateBinary(n-1, result+"0");

        }



    }

    public static void main(String[] args) {
        generateBinary(3,"0");
        generateBinary(3,"1");
    }


}
