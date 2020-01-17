package com.BacktrackingAlgo.HamiltonCycle;

public class App {


    public static void main(String str[]){

        int adj[][] = {
                {0,1,1,0,1},
                {1,0,1,1,0},
                {1,1,0,0,0},
                {0,1,0,0,1},
                {1,0,0,1,0}
        };

        HamiltonCycle hmHamiltonCycle = new HamiltonCycle(adj);
        hmHamiltonCycle.solve();
    }
}
