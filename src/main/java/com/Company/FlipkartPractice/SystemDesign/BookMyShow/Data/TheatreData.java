package com.Company.FlipkartPractice.SystemDesign.BookMyShow.Data;

import com.Company.FlipkartPractice.SystemDesign.BookMyShow.Movie.Movie;
import com.Company.FlipkartPractice.SystemDesign.BookMyShow.Theatre.Hall;
import com.Company.FlipkartPractice.SystemDesign.BookMyShow.Theatre.Theatre;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TheatreData {

    private static List<Theatre> theatreList = new ArrayList <>();

    public List<Theatre> getListOfTheatre(){
        return theatreList;
    }

    public void addDefaultData(){
        HallData hallData = new HallData();
        hallData.addDefaultDataToList();
        List<Hall> listOfHalls = hallData.getListOfHall();


        Theatre theatre = new Theatre("Theatre 1", Arrays.asList(listOfHalls.get(0), listOfHalls.get(1)));
        Theatre theatre1 = new Theatre("Theatre 2", Arrays.asList(listOfHalls.get(2),listOfHalls.get(3),listOfHalls.get(4)));

        theatreList = Arrays.asList(theatre,theatre1);

    }

    public void addTheatre(Theatre t1){
        theatreList.add(t1);
    }



}
