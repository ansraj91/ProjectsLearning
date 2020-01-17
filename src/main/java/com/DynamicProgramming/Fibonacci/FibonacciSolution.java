package com.DynamicProgramming.Fibonacci;

import java.util.HashMap;

public class FibonacciSolution {


    public HashMap<Integer,Integer> fiboMem = new HashMap<>();

    public int dynamicSolution(int num){


        if(fiboMem.containsKey(num)) return fiboMem.get(num);
        fiboMem.put(num-1, dynamicSolution(num-1));
        fiboMem.put(num-2,dynamicSolution(num-2));
        int calulatedNum = fiboMem.get(num-1) + fiboMem.get(num-2);
        fiboMem.put(num, calulatedNum);

        return calulatedNum;


    }



    public int naiveSolution(int num){
        if(num ==0) return 0;
        if(num == 1) return 1;

        return naiveSolution(num-1) + naiveSolution(num-2);
    }
}
