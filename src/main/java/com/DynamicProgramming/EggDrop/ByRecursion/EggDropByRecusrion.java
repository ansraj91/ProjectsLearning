package com.DynamicProgramming.EggDrop.ByRecursion;

public class EggDropByRecusrion {

    static int min_drops = Integer.MAX_VALUE;
    public static int getNoOFDrops(int noOfEggs, int noOfFloors){

        if(noOfEggs == 1 || noOfFloors == 0 || noOfFloors == 1 ) return noOfFloors;

        for(int i=1;i<=noOfFloors;i++){
            int eggBreaks = getNoOFDrops(noOfEggs-1, i-1);

            int eggNotBreaks = getNoOFDrops(noOfEggs, noOfFloors-i);

            int drop =  Math.max(eggBreaks,eggNotBreaks) +1;

            if(min_drops > drop ){
                min_drops = drop;
            }
        }
        return min_drops;

    }

    public static void main(String[] args) {
        System.out.println(EggDropByRecusrion.getNoOFDrops(2,8));
    }


}
