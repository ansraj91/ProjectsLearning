package com.Rehersal.DP;

public class Knapsack1 {

    int itemValues[];
    int itemWeights[];
    int knapsackWeight;
    int knapSackTable[][];

    public Knapsack1(int itemValues[], int itemWeights[], int kw){
        this.itemValues = itemValues;
        this.itemWeights = itemWeights;
        this.knapsackWeight = kw;
        this.knapSackTable = new int[kw+1][kw+1];
    }



    public void solve(){

        for(int i=1;i<=itemValues.length;i++){
           for(int kw = 1;kw<=knapsackWeight;kw++){
               int notTakingItem=0;
               int takingItem=0;
                   //Not taking the item
                   notTakingItem = knapSackTable[i-1][kw];
               if(itemWeights[i-1]<=kw){
                   takingItem = itemValues[i-1]+knapSackTable[i-1][kw-itemWeights[i-1]];
               }

               knapSackTable[i][kw] = Math.max(takingItem,notTakingItem);
           }

        }

        for(int i=0;i<itemWeights.length+1;i++){
            for(int j=0;j<=knapsackWeight;j++){
                System.out.print(knapSackTable[i][j] + " ");
            }

            System.out.println();
        }

    }

    public void pickedItems(){
        int j=knapsackWeight;
        for(int i=itemWeights.length;i>0 && j>0;){

                if(knapSackTable[i][j-1]==knapSackTable[i][j]){
                    j--;
                }else if(knapSackTable[i-1][j] == knapSackTable[i][j]){
                    i--;
                }else {
                    System.out.println("Item:" + i + " taken!");
                    i--;
                }

        }
    }

    public static void main(String[] args) {
        int itemValues[] = {2,5,3,6,1};
        int itemWeight[] = {3,2,5,1,2};

        Knapsack1 knapsack1 = new Knapsack1(itemValues,itemWeight,5);
        knapsack1.solve();
        knapsack1.pickedItems();

    }

}
