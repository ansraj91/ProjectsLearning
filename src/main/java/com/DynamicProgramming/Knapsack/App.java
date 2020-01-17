package com.DynamicProgramming.Knapsack;

public class App {

    static int noOfItems = 3;
    static int weight[] =new int[noOfItems+1];
    static int values[] = new int[noOfItems+1];
    static int capacityKnapsack = 5;
    public static void main(String str[]){

        weight[1] = 4;
        weight[2] = 2;
        weight[3] = 3;

        values[1] = 10;
        values[2] = 4;
        values[3] = 7;


        KnapsackProblem knapsackProblem = new KnapsackProblem(capacityKnapsack,weight,values,noOfItems);
        knapsackProblem.solveKnapsack();
    }

}
