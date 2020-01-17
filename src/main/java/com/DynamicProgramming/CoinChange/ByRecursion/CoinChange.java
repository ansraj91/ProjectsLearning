package com.DynamicProgramming.CoinChange.ByRecursion;

import java.util.ArrayList;

public class CoinChange {

    int coins[];
    int noOfCoins;
    int sum;
    ArrayList<ArrayList<Integer>> solution;


    public CoinChange(int coins[],int noOfCoins, int sum){
        this.coins = coins;
        this.noOfCoins = noOfCoins;
        this.sum = sum;

    }

    public void solve(){
        int count = 0;

        System.out.println(coinChangeSoln(coins,noOfCoins,sum));


    }

    public int coinChangeSoln(int coins[],int noOfCoins,int sum){
        if(sum==0) return 1;
        if(sum<0 ) return 0;
        if(noOfCoins<=0 && sum>0) return 0;

        return coinChangeSoln(coins,noOfCoins-1,sum) + coinChangeSoln(coins,noOfCoins,sum-coins[noOfCoins-1]);
    }

public static void main(String str[]){
        int coins[] = {1,2,4};
        CoinChange coinChange = new CoinChange(coins,3,4);
        coinChange.solve();
}



}
