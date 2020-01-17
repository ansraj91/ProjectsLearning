package com.DynamicProgramming.Knapsack;

public class KnapsackProblem {

    int capacityKnapsack;
    int knapsackMattrix[][];
    int weights[];
    int values[];
    int noOfItems;
    int totalBenifit;

    public KnapsackProblem(int capacityKnapsack, int weights[], int values[],int noOfItems){
        this.values  = values;
        this.weights = weights;
        this.capacityKnapsack = capacityKnapsack;
        this.noOfItems =noOfItems;

        knapsackMattrix = new int[noOfItems+1][capacityKnapsack+1];

    }


    public void solveKnapsack(){

        for(int i=1;i<noOfItems+1;i++){
            for(int w=1;w<capacityKnapsack+1;w++){
                int notTakingItem = knapsackMattrix[i-1][w];
                int takingItem = 0;
                if(weights[i]<=w){
                    takingItem = values[i]+knapsackMattrix[i-1][w-weights[i]];
                }

                knapsackMattrix[i][w] = Math.max(notTakingItem,takingItem);
            }


        }
        totalBenifit = knapsackMattrix[noOfItems][capacityKnapsack];

        System.out.println(totalBenifit);

    }




}
