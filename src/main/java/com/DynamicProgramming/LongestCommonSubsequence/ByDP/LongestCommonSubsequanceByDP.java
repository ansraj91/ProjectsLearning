package com.DynamicProgramming.LongestCommonSubsequence.ByDP;

public class LongestCommonSubsequanceByDP {


    public static int Solution(String s1,String s2){
        int dpTable[][];
        int len1 = s1.length()+1;
        int len2 = s2.length()+1;
        dpTable = new int[s1.length()+1][s2.length()+1];

        for(int i=0;i<len1;i++){
            dpTable[i][0] = 0;
        }
        for(int j=0;j<len2;j++){
            dpTable[0][j] = 0;
        }

        for(int i=1;i<len1;i++){
            for(int j=1;j<len2;j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dpTable[i][j] = dpTable[i-1][j-1]+1;
                }else{
                    dpTable[i][j] = Math.max(dpTable[i-1][j],dpTable[i][j-1]);
                }

            }
        }

        return dpTable[len1-1][len2-1];

    }

    public static void main(String[] args) {
        System.out.println("By DP:"+LongestCommonSubsequanceByDP.Solution(new String("abcdgh"), new String( "aedfhr")));
    }

}
