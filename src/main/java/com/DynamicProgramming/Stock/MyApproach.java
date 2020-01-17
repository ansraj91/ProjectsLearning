package com.DynamicProgramming.Stock;

import java.util.ArrayList;
import java.util.List;

public class MyApproach {

    public static long stockmax(List<Integer> prices) {
        int totalShares = 1;
        long currentProfit =  0;
        long totalProfit = 0;
        long totalCost =  prices.get(0);
        int len = prices.size();
        for(int i=1;i<len;i++){
            int currentCost = prices.get(i);
            int lastCost = prices.get(i-1);
            if(currentCost>=lastCost){

                if(currentProfit <= (totalShares*currentCost - totalCost) ){
                    currentProfit = (totalShares*currentCost - totalCost);
                    totalCost +=currentCost;
                    totalShares++;
                }

            }else{
                totalCost = currentCost;
                totalProfit += currentProfit;
                currentProfit = 0;
                totalShares=1;

            }

        }

        if(currentProfit!=0) totalProfit+=currentProfit;

        return totalProfit;


    }

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList <>();
        al.add(5);
        al.add(3);
        al.add(2);
        al.add(4);
        al.add(1);
        al.add(5);

        ArrayList<Integer> al2 = new ArrayList <>();
        al2.add(1);
        al2.add(3);
        al2.add(1);
        al2.add(2);


        System.out.println(MySecondApproach.stockmax(al2));
        System.out.println(MyApproach.stockmax(al2));

    }



}

class MySecondApproach{
    public static long stockmax(List<Integer> prices) {
        long totalCost = 0;
        long totalProfit = 0;
        int len = prices.size();
        if(len == 0) return totalProfit;

        totalCost+=prices.get(0);
        int totalProfitableShares = 1;
        long smallProfit = 0;
        long totalSmallCost = prices.get(0);
        long currentSmallProfit = 0;
        for(int d=1;d<len;d++){
            int currentCost = prices.get(d);
            int lastCost = prices.get(d-1);
            if(currentCost>=lastCost){

                if(smallProfit <= (totalProfitableShares*currentCost - totalSmallCost) ){
                    smallProfit = (totalProfitableShares*currentCost - totalSmallCost);
                    totalCost +=currentCost;
                    totalProfitableShares++;
                }

            }else{
                totalSmallCost = currentCost;
                smallProfit += smallProfit;
                currentSmallProfit = 0;
                totalProfitableShares=1;

            }

            if((prices.get(d)*d)>totalCost){
                long currrentProfit = (prices.get(d)*d)-totalCost;
                if(totalProfit < currrentProfit ){
                    totalProfit = currrentProfit;
                }
            }
            totalCost+=prices.get(d);
        }

        return totalProfit;



    }


}
