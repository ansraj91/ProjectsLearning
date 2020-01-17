package com.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestCommonPrefix {

    public static String solve(List<String> A){

        int min = Integer.MAX_VALUE;
        int index = 0;

        for(int i=0;i<A.size();i++){
            if(min>A.get(i).length()){
                min = A.get(i).length();
                index = i;
            }
        }
        int charIndex = 0;
        boolean ex = false;
        for(int i=0;i<A.get(index).length();i++){

            for(int j=0;j<A.size();j++){
                if(A.get(j).charAt(i)!=(A.get(index).charAt(i))){
                    charIndex = i;
                    ex = true;
                    break;

                }

            }
            if(ex) break;
            else charIndex = i+1;



        }

        if(charIndex ==0) return "";
        return A.get(index).substring(0,charIndex);


    }

    public static void main(String[] args) {
        String arr[] = new String[]{"afbcd","abcdfgh"};

        List<String> arrayList = Arrays.asList(arr);

        System.out.println((solve(arrayList)));

    }



}
