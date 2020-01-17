package com.DynamicProgramming.EggDrop.ByRecursion;

public class EggDropDP {


    public static  int solve(int noOfEgg, int noOfFloor){
     int  minDrop = Integer.MAX_VALUE;
        int minDropCache[][] = new int[noOfEgg+1][noOfFloor+1];
        for(int i=0;i<=noOfEgg;i++){
            minDropCache[i][0] = 0;
        }
        for(int i=0;i<=noOfEgg;i++){
            minDropCache[i][1] = 1;
        }
        for(int j=0;j<=noOfFloor;j++){
            minDropCache[0][j] = 0;
        }

      for(int i=0;i<=noOfFloor;i++){
          minDropCache[1][i] = i;
      }


      for(int e=2;e<=noOfEgg;e++){
          for(int f=1;f<=noOfFloor;f++){

              int eggBreak = minDropCache[e-1][f];
              int noBreak = minDropCache[e][noOfFloor-f];

              int currMax = Math.max(eggBreak,noBreak)+1;
                 minDrop = currMax;

          }
      }

      return minDrop;
    }


    public static void main(String[] args) {
        int noOfFloor = 10;
        int noOfegg = 3;
        System.out.println(EggDropDP.solve(noOfegg,noOfFloor));



    }

}
