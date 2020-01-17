package com.DynamicProgramming.Stock;

import java.util.ArrayList;
import java.util.List;

public class HackerRankApproach {



    public static int maxProfit(List<Integer> sharePrices){
        int maxSharePriceSofar = 0;
        int profit = 0;

        for(int i=sharePrices.size()-1;i>-1;i--){
            maxSharePriceSofar = Integer.max(maxSharePriceSofar, sharePrices.get(i));
            profit += (maxSharePriceSofar - sharePrices.get(i));
            System.out.println("--"+profit);
        }

        return profit;


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


        System.out.println(HackerRankApproach.maxProfit(al));
        System.out.println(HackerRankApproach.maxProfit(al2));

    }


}
