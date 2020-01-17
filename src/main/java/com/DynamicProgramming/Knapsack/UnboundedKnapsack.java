package com.DynamicProgramming.Knapsack;

import java.util.Arrays;

public class UnboundedKnapsack {
    
    
    //Not completed--
    public static int solve(int value,int values[]){

        int dp[][] = new int[values.length+1][value+1];
        
        for(int i=0;i<values.length+1;i++){
            dp[i][0] = 0;
        }
        for(int j=0;j<value+1;j++){
            dp[0][j] = 0;
        }

        for(int i=1;i<values.length+1;i++){
            for(int j=1;j<value+1;j++ ){
                int notTaking = dp[i-1][j];
                int taking = 0;
                if(values[i-1] <=j){
                    taking = values[i-1] + dp[i-1][value-j];
                }
                if(taking>notTaking && taking<=value){
                    dp[i][j] = taking;

                }else{
                    dp[i][j] = notTaking;
                }
            }

        }


        return dp[3][6];

        
        
        
        
    }

    public static void main(String[] args) {
        int values[] = {1,6,9};
        int value = 12;

        System.out.println(solve(value,values));

    }
    
}
