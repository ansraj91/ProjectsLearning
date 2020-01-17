package com.DynamicProgramming;

public class LongestPalindromicSubString {

//“forgeeksskeegfor


    public static String solve(String str){

        String maxLengthString = new String();
        int i=0;
        while(i<str.length()){
            String tempMax = expandPAlindrom(str,i,i);
            if(tempMax.length()>maxLengthString.length()){
                maxLengthString = tempMax;
            }
            if(i+1<str.length());
            String temp2Max = expandPAlindrom(str,i,i+1);
            if(temp2Max.length()>maxLengthString.length()){
                maxLengthString = temp2Max;
            }


            i++;

        }
        return maxLengthString;

    }

    public static String expandPAlindrom(String str,int i,int j){
        int len = str.length();
        int maxLen = 0;
        int i1=i;
        int j1=j;
        while(i1>=0 && j1<len && str.charAt(i1)==str.charAt(j1)){
            i1--;
            j1++;

        }
        return str.substring(i1+1,j1);
    }

    public static void main(String[] args) {
        System.out.println(solve("forgeekskskeegfor"));
    }


}
