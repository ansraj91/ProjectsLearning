package com.Rehersal.DP;

public class LongestCommonSubSeqByRec {


    public int solve(String s1, String s2){

        if(s1.length() ==0 || s2.length()==0) return 0;
        if(s1.charAt(s1.length()-1) == s2.charAt(s2.length()-1)){
            s1 = s1.substring(0,s1.length()-1);
            s2 = s2.substring(0,s2.length()-1);
            return 1+solve(s1,s2);
        }

        return Math.max(solve(s1,s2.substring(0,s2.length()-1)),solve(s1.substring(0,s1.length()-1),s2));

    }

    public static void main(String[] args) {
        LongestCommonSubSeqByRec longestCommonSubSeqByRec = new LongestCommonSubSeqByRec();
        System.out.println(longestCommonSubSeqByRec.solve("abcdgh","aedfhr"));
    }



}
