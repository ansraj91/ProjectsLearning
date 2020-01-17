package com.JustPracticeRandomQuestions.RankingLeadership;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class ClimbingLeadership {


    // Complete the climbingLeaderboard function below.
    static int[] climbingLeaderboard(int[] scores, int[] alice) {

        //int LinkedHashMap<Integer,Integer> ranking = new LinkedHashMap<Integer,Integer>();
        LinkedHashSet <Integer> ranking = new LinkedHashSet <Integer>();
        ArrayList <Integer> socreRanking = new ArrayList <>();
        int arr[] = new int[alice.length];

        for (int i = 0; i < scores.length; i++) {
            if (!ranking.contains(scores[i])) {
                ranking.add(scores[i]);
                socreRanking.add(scores[i]);
            }
        }
        socreRanking.forEach(System.out::println);
        int noOfRanks = socreRanking.size();
        for (int i = 0; i < alice.length; i++) {
           /* if (alice[i] >= socreRanking.get(i)) {
                arr[i] = 1;
                continue;
            }*/
            if (alice[i] < socreRanking.get(socreRanking.size()-1)) {
                arr[i] = socreRanking.size() + 1;
                continue;
            }
            if (alice[i] >= socreRanking.get(0)) {
                arr[i] = 1;
                continue;
            }

            int mid = noOfRanks / 2;
            int low = 0;
            int high = noOfRanks-1;

            while (low >= 0 && high > 0 && mid>0) {
                if (alice[i] == socreRanking.get(mid)) {
                    arr[i] = mid+1;
                    break;
                }
                if (alice[i] == socreRanking.get(high)) {
                    arr[i] = high+1;
                    break;
                }
                if (alice[i] == socreRanking.get(low)) {
                    arr[i] = low+1;
                    break;
                }
                if (alice[i] < socreRanking.get(mid) ) {
                    if ((high-low) == 1) {
                        arr[i] = high+1;
                        break;
                    } else {
                        low = mid;
                        mid = ((high - low) / 2)+low;
                        continue;
                    }
                }
                if (alice[i] > socreRanking.get(mid) ) {
                    if ((mid-low) == 1) {
                        arr[i] = mid+1;
                        break;
                    } else {
                        high = mid;
                        mid = low+((high - low) / 2);
                        continue;
                    }
                }


            }


        }
        return arr;
    }


    public static void main(String str[]){
        int scores[] = {100,100,50,40,40,20,10};
        int alice[] = {5,25,50,120};

       Arrays.stream(ClimbingLeadership.climbingLeaderboard(scores,alice)).forEach(s->System.out.print(s + " "));

    }
}




