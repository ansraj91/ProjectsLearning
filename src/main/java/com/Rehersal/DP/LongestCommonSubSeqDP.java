package com.Rehersal.DP;

public class LongestCommonSubSeqDP {

    int result[][];
    String s1;
    String s2;
    public LongestCommonSubSeqDP(String s1,String s2 ){
        this.s1 = s1;
        this.s2 = s2;
        result = new int[s1.length()+1][s2.length()+1];
    }

    public void Solve(){

        for(int i=1;i<=s1.length();i++){
            for(int j=1;j<=s2.length();j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    result[i][j] = 1+result[i-1][j-1];
                }else{
                    result[i][j] = Math.max(result[i][j-1],result[i-1][j]);
                }

            }
        }

    }

    public void result(){
        for(int i=0;i<=s1.length();i++){
            for(int j=0;j<=s2.length();j++){
                System.out.print(result[i][j] + " ");
            }

            System.out.println();
        }
    }



    public static void main(String[] args) {
        LongestCommonSubSeqDP longestCommonSubSeqDP = new LongestCommonSubSeqDP("ABCD","BACDBDCD");
        longestCommonSubSeqDP.Solve();
        longestCommonSubSeqDP.result();
    }



}
