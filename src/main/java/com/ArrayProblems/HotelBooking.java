package com.ArrayProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HotelBooking {

    public static boolean hotel(List<Integer> arrive, List<Integer> depart, int K) {
        Collections.sort(arrive);
        Collections.sort(depart);
        int roomsRequired=K,i=0,j=0;
        while(i<arrive.size()  && j<arrive.size() && roomsRequired>0){
            if(arrive.get(i)<depart.get(j) ){
                i++;
                roomsRequired--;
            }else{
                j++;
                roomsRequired++;
            }
            if(roomsRequired<K) return false;
        }

        return true;

    }

    public static void main(String[] args) {
        Integer arrival[] =  new Integer[]{17, 0, 45, 11, 16, 43, 15, 42, 2, 41, 0, 27, 37, 25, 17, 42, 24, 23, 11, 4, 29, 39, 6, 10, 42, 16, 17, 39, 1 };
        Integer depart[] = new Integer[]{ 25, 24, 52, 51, 26, 46, 25, 45, 9, 51, 49, 48, 51, 66, 65, 57, 69, 43, 50, 9, 32, 55, 10, 58, 62, 46, 19, 87, 12 };
        int c = 16;

        System.out.println(hotel(Arrays.asList(arrival),Arrays.asList(depart),c));
    }
}
