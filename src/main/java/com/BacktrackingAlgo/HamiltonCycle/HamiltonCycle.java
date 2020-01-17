package com.BacktrackingAlgo.HamiltonCycle;

public class HamiltonCycle {

    int[][] adjencyMattrix;
    int noOfVertix;
    int path[];

    public HamiltonCycle(int adjencyMattrix[][]) {
        this.adjencyMattrix = adjencyMattrix;
        this.noOfVertix = adjencyMattrix.length;
        path = new int[adjencyMattrix.length];
        path[0] = 0;
    }

    public void solve() {
        if (isHamilton(1)) {
                System.out.println("Yes!!");
                for(int i=0;i<noOfVertix;i++){
                    System.out.println(path[i]);
                }

            } else {
                System.out.println("No");
            }
    }


    public boolean isHamilton(int actualIndex) {
        if (actualIndex == noOfVertix) {
            if (adjencyMattrix[actualIndex-1][path[0]] == 1) {
                return true;

            }else{
                return false;
            }
        }

        for (int indexVertice = 1; indexVertice < noOfVertix; indexVertice++) {
            System.out.println(indexVertice);
            if (isValidHamiltonVertice(indexVertice, actualIndex)) {
                path[actualIndex] = indexVertice;

                if (isHamilton(actualIndex+1)) {
                    return true;
                }

            }



        }

        return false;
    }

    private boolean isValidHamiltonVertice(int indexVertice, int actualIndex) {

        if (adjencyMattrix[path[actualIndex-1]][indexVertice] == 0) {
            return false;

        }
        for (int i = 0; i < actualIndex; i++) {
            if (path[i] == indexVertice) {
                return false;
            }


        }
        return true;
    }
}



