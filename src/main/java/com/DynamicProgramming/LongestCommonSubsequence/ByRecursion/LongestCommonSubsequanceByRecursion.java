package com.DynamicProgramming.LongestCommonSubsequence.ByRecursion;

public class LongestCommonSubsequanceByRecursion {

    public static int solution(String s1, String s2){
        if(s1.length()==0 || s2.length()==0) return 0;

        if(s1.charAt(s1.length()-1)==s2.charAt(s2.length()-1)) {

            s1 = s1.substring(0,s1.length()-1);
            s2 = s2.substring(0,s2.length()-1);

            return 1+solution(s1,s2);
        }

        return Math.max(solution(s1, s2.substring(0,s2.length()-1)), solution(s1.substring(0,s1.length()-1), s2));
    }


    public static void main(String[] args) {
        System.out.println("By Recusrion:"+LongestCommonSubsequanceByRecursion.solution(new String("abcdgh"), new String( "aedfhr")));
    }

}
