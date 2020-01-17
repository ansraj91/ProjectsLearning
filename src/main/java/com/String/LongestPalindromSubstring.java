package com.String;

import com.Rehersal.DP.LongestIncreasingSubSeq;

public class LongestPalindromSubstring {


    public String solve(String s){
        if(s.length()<=1) return s;

        String longest = s.substring(0,1);

        for(int i=0;i<s.length();i++){
            String temp = expand(s,i,i);
            System.out.println("Longest:" + longest);
            System.out.println("Temp:" + temp);
            if(temp.length()>longest.length()){
                longest = temp;
            }
            temp = expand(s,i,i+1);

            System.out.println("Longest:" + longest);
            System.out.println("Temp:" + temp);
            if(temp.length()>longest.length()){
                longest = temp;
            }
            System.out.println();
        }

        return longest;

    }

    public String expand(String s, int begin, int end){
        while(begin>=0 && end<=s.length()-1 && s.charAt(begin)==s.charAt(end)){
            begin--;
            end++;
        }

        return s.substring(begin+1,end);

    }

    public static void main(String[] args) {
        LongestPalindromSubstring LongestPalindromSubstring = new LongestPalindromSubstring();
        System.out.println(LongestPalindromSubstring.solve("forgeekskeegfor"));
    }

}
