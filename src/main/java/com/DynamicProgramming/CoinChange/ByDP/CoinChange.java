package com.DynamicProgramming.CoinChange.ByDP;

public class CoinChange {

    private int noOfCoins;
    int totalAmount;
    int coins[];
    int solMattrix[][];
    public CoinChange(int noOfCoins, int totalAmount, int[] coins) {
        this.noOfCoins = noOfCoins;
        this.totalAmount = totalAmount;
        this.coins = coins;

        solMattrix = new int[noOfCoins+1][totalAmount+1];

        for(int i=0,j=0;i<noOfCoins+1;i++){
            solMattrix[i][j] = 1;
        }
    }


    public void solution(){
        for(int i=1;i<noOfCoins+1;i++){
            for(int j=1;j<totalAmount+1;j++ ){
                int notTaken = solMattrix[i-1][j];
                int taken = 0;
                if(coins[i]<=j){
                    taken = solMattrix[i][j-coins[i]];
                }

                solMattrix[i][j] = taken+notTaken;

            }
        }

        System.out.println(solMattrix[noOfCoins][totalAmount]);
    }

    public static void main(String str[]){
        int coins[] = {0,1,2,4};
        CoinChange coinChange = new CoinChange(3,4,coins);
        coinChange.solution();
    }



}
