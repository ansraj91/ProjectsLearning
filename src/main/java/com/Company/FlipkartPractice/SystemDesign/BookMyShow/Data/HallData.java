package com.Company.FlipkartPractice.SystemDesign.BookMyShow.Data;

import com.Company.FlipkartPractice.SystemDesign.BookMyShow.Movie.Movie;
import com.Company.FlipkartPractice.SystemDesign.BookMyShow.Theatre.Hall;

import java.util.*;

public class HallData {

    private  List<Hall> listHall = new ArrayList <>();

    public  List<Hall> getListOfHall(){
        return Collections.unmodifiableList(listHall);
    }

    public void addDefaultDataToList(){
        MovieData movieData =  new MovieData();
        movieData.addDefaultDatToList();
        List<Movie> movieList = movieData.getListOfMovies();
        Hall hall = new Hall(5, movieList.get(0),1);
        Hall hall1 = new Hall(150, movieList.get(1),2);
        Hall hall2 = new Hall(200, movieList.get(2),1);
        Hall hall3 = new Hall(120, movieList.get(3),2);
        Hall hall5 = new Hall(150, movieList.get(1),5);

        listHall = Arrays.asList(hall,hall1,hall2,hall3,hall5);


    }

    public void addNewHall(Hall hall ){
        listHall.add(hall);
    }








}
