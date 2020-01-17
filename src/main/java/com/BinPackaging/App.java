package com.BinPackaging;

import java.util.ArrayList;
import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        ArrayList<Integer> items = new ArrayList <Integer>(Arrays.asList(new Integer[]{2, 3, 4, 5, 4,1,1}));
        SolveFitFirstDecreasing solveFitFirstDecreasing = new SolveFitFirstDecreasing(items,5);
        solveFitFirstDecreasing.solve();
        solveFitFirstDecreasing.showResult();

    }



}
