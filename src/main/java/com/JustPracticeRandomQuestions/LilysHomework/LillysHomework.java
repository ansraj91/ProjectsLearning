package main.java.com.JustPracticeRandomQuestions.LilysHomework;

import java.util.Arrays;

public class LillysHomework {

    public static int runningTime(int[] array) {
        int shifts = 0;
        for (int i = 1; i < array.length; i++) {
            int j = i;
            int value = array[i];
            while (j >= 1 && array[j-1] > value) {
                array[j] = array[j-1];
                j--;
                shifts++;
            }
            array[j] = value;
        }
        //System.out.println(shifts);
        return shifts;
    }


    public static void main(String[] args) {
        int arr[] = {2,1,3,1,2};
        System.out.println(LillysHomework.runningTime(arr));
        Arrays.stream(arr).forEach(System.out::print);

    }

}

